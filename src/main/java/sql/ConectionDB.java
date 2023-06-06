package main.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	
}
