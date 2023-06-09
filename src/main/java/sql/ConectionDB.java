package main.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	
	public static void loginRequest(String query) throws SQLException{
		Connection sql = connect();
		try {
			Statement statement = sql.createStatement();
			
			statement.executeQuery("");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException();
		}
	}
	
	public static void registerRequest(String correo,
										String nombre,
										String apellidos,
										String password,
										String peso,
										String estatura,
										String fechaDeNacimiento) throws SQLException{
		Connection sql = connect();
		try {
			String query = "SELECT COUNT(*) as count FROM mydb.usuario WHERE correo = ? HAVING count > 0";
			PreparedStatement statement = sql.prepareStatement(query);
			
			statement.setString(1, "test@gmail.com");
			
			ResultSet result = statement.executeQuery();
			result.next();
			
			if(result.getInt("count") > 0) {
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException();
		}
	}
	
}
