package main.java.sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.java.exception.CredentialsException;
import main.java.exception.DuplicateMailException;

public abstract class ConectionDB {
	
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
	
	public static void loginRequest(String correo, String password) throws SQLException,CredentialsException{
		Connection sql = connect();
		PreparedStatement statement = null;
		ResultSet result = null;
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
			
			closeConnection(result, statement, sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException();
		} finally {
			closeConnection(result, statement, sql);
		}
	}
	
	public static void registerRequest(String correo,
										String nombre,
										String apellidos,
										String password,
										String peso,
										String estatura,
										String fechaDeNacimiento) throws SQLException,DuplicateMailException{
		Connection sql = connect();
		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			//	COMPRUEBA CORREO EXISTENTE
			String query = "SELECT COUNT(*) as count FROM mydb.usuario WHERE correo = ? HAVING count > 0";
			statement = sql.prepareStatement(query);
			
			statement.setString(1, correo);
			
			result = statement.executeQuery();
			result.next();

			if(result.getRow() != 0) {
				throw new DuplicateMailException();
			}
			
			statement.close();
			
			//	AGREGA LOS DATOS A LA TABLA
			
			query = "INSERT INTO mydb.usuario (correo, nombre, apellidos, contraseña, peso_kg, estatura_m, fecha_de_nacimiento) VALUES (?,?,?,?,?,?,?)";
			
			statement = sql.prepareStatement(query);
			
			statement.setString(1, correo);
			statement.setString(2, nombre);
			statement.setString(3, apellidos);
			statement.setString(4, password);
			statement.setString(5, peso);
			statement.setString(6, estatura);
			statement.setDate(7, Date.valueOf(fechaDeNacimiento));
			
			statement.executeUpdate();
			
			closeConnection(result, statement, sql);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException();
		} finally {
			closeConnection(result, statement, sql);
		}
	}
	
}
