package main.java;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.java.exception.CredentialsException;
import main.java.exception.DuplicateMailException;
import main.java.exception.DuplicateTarifaException;

public abstract class ConnectionDB {
	
	public static final String url = "jdbc:mysql://localhost:3306/mydb";
	public static final String user = "root";
	public static final String password = "root";
	
	public static Connection connect() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// aviso de error por conexion
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void closeConnection(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {
		// Cerrar el ResultSet
	    if (resultSet != null) {
	        try {
	            resultSet.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Cerrar el PreparedStatement
	    if (preparedStatement != null) {
	        try {
	            preparedStatement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    // Cerrar la Connection
	    if (connection != null) {
	        try {
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	
	public static UserCredential loginRequest(String correo, String password) throws SQLException,CredentialsException{
		Connection sql = connect();
		PreparedStatement statement = null;
		ResultSet result = null;
		UserCredential userCredential = null;
		try {
			String query = "SELECT correo,contraseña FROM mydb.usuario WHERE correo = ? && contraseña = ?";
			
			statement = sql.prepareStatement(query);
			
			statement.setString(1, correo);
			statement.setString(2, password);
			
			result = statement.executeQuery();
			result.next();
			
			if(result.getRow() == 0) {
				throw new CredentialsException();
			}
			
			userCredential = loadUserCredential(correo);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException();
		} finally {
			closeConnection(result, statement, sql);
		}
		return userCredential;
	}
	
	public static void registerRequest(UserCredential userCredential) throws SQLException,DuplicateMailException{
		Connection sql = connect();
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			//	COMPRUEBA CORREO EXISTENTE
			String query = "SELECT COUNT(*) as count FROM mydb.usuario WHERE correo = ? HAVING count > 0";
			statement = sql.prepareStatement(query);
			
			statement.setString(1, userCredential.correo);
			
			result = statement.executeQuery();
			result.next();

			if(result.getRow() != 0) {
				throw new DuplicateMailException();
			}
			
			statement.close();
			
			//	AGREGA LOS DATOS A LA TABLA
			
			query = "INSERT INTO mydb.usuario (correo, nombre, apellidos, contraseña, peso_kg, estatura_m, fecha_de_nacimiento, icono) VALUES (?,?,?,?,?,?,?,?)";
			
			statement = sql.prepareStatement(query);
			
			statement.setString(1, userCredential.correo);
			statement.setString(2, userCredential.nombre);
			statement.setString(3, userCredential.apellidos);
			statement.setString(4, userCredential.password);
			statement.setString(5, String.valueOf(userCredential.peso));
			statement.setString(6, String.valueOf(userCredential.estatura));
			statement.setDate(7, Date.valueOf(userCredential.fechaDeNacimiento));
			statement.setBytes(8, userCredential.icono);
			
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(result, statement, sql);
		}
	}
	
	public static UserCredential loadUserCredential(String correo) throws CredentialsException{
		Connection sql = connect();
		PreparedStatement statement = null;
		ResultSet result = null;
		UserCredential userCredential = null;
		try {
			String query = "SELECT * FROM mydb.usuario WHERE correo = ?";
			statement = sql.prepareStatement(query);

			statement.setString(1, correo);
			
			result = statement.executeQuery();
			result.next();
			if(result.getRow() != 0) {
				userCredential = new UserCredential(result.getString("correo"),
													result.getString("nombre"),
													result.getString("apellidos"),
													result.getString("contraseña"),
													result.getFloat("peso_kg"),
													result.getFloat("estatura_m"),
													result.getString("fecha_de_nacimiento"),
													result.getBytes("icono"));
			} else {
				throw new CredentialsException("Credenciales no encontradas");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(result, statement, sql);
		}
		
		return userCredential;
	}
	
	public static String[] getClientesCorreo() {
		Connection sql = connect();
		PreparedStatement statement = null;
		ResultSet result = null;
		String[] clientes = null;
		try {
			String query = "SELECT COUNT(*) as count FROM mydb.usuario";
			statement = sql.prepareStatement(query);
			result = statement.executeQuery();
			result.next();
			int row = result.getInt("count");
			
			statement.close();
			result.close();
			
			query = "SELECT correo FROM mydb.usuario";
			statement = sql.prepareStatement(query);
			
			result = statement.executeQuery();
			
			clientes = new String[row];
			
			int i = 0;
			while(result.next()) {
				clientes[i] = result.getString("correo");
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(result, statement, sql);
		}
		return clientes;
	}
	
	public static void deleteUser(String correo) {
		Connection sql = connect();
		PreparedStatement statement = null;
		
		try {
			String query = "DELETE FROM mydb.usuario WHERE correo = ?";
			statement = sql.prepareStatement(query);
			statement.setString(1, correo);
			
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection(null, statement, sql);
		}
	}
	
	public static void createTarifaRequest(String nombre,
											String duracion,
											String precio) throws DuplicateTarifaException {
		Connection sql = connect();
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			String query = "SELECT COUNT(*) as count FROM mydb.tarifa WHERE nombre = ? HAVING count > 0";
			statement = sql.prepareStatement(query);
			
			statement.setString(1, nombre);
			
			result = statement.executeQuery();
			result.next();

			if(result.getRow() != 0) {
				throw new DuplicateTarifaException();
			}
			
			statement.close();
			
			query = "INSERT INTO mydb.tarifa (nombre,duracion_horas,precio) VALUES (?,?,?);";
			
			statement = sql.prepareStatement(query);
			
			statement.setString(1, nombre);
			statement.setInt(2, Integer.valueOf(duracion));
			statement.setFloat(3, Float.valueOf(precio));
			
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(result, statement, sql);
		}
	}
	
	public static String[] getTarifasNombre() {
		Connection sql = connect();
		PreparedStatement statement = null;
		ResultSet result = null;
		String[] tarifas = null;
		try {
			String query = "SELECT COUNT(*) as count FROM mydb.tarifa";
			statement = sql.prepareStatement(query);
			result = statement.executeQuery();
			result.next();
			int row = result.getInt("count");
			
			statement.close();
			result.close();
			
			query = "SELECT nombre FROM mydb.tarifa";
			statement = sql.prepareStatement(query);
			
			result = statement.executeQuery();
			
			tarifas = new String[row];
			
			int i = 0;
			while(result.next()) {
				tarifas[i] = result.getString("nombre");
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection(result, statement, sql);
		}
		return tarifas;
	}
	
}
