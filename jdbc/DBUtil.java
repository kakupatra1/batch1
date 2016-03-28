package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/jdbcdb";
		String id = "root";
		String pwd = "javahome";
		
		return DriverManager.getConnection(url, id, pwd);
		
	}
}
