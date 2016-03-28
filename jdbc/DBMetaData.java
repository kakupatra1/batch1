package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class DBMetaData {
	public static void main(String[] args) throws Exception {
		Connection con = DBUtil.getConnection();
		
//      Data Base Meta Data
		
		DatabaseMetaData dbMetaData = con.getMetaData();
		System.out.println("MajorVersion "+dbMetaData.getDatabaseMajorVersion());
		System.out.println("Product Name "+dbMetaData.getDatabaseProductName());
		System.out.println("Driver Manager Version "+dbMetaData.getDriverMajorVersion());

		
//		ResultSet Meta Data
		
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM STUDENTS");
		ResultSetMetaData rsMetaData = pstmt.getMetaData();
		
		System.out.println("No of colums "+rsMetaData.getColumnCount());
		System.out.println("First Coumn's Name "+rsMetaData.getColumnLabel(1));
		System.out.println("Second Coumn's Name "+rsMetaData.getColumnLabel(2));
		
		
	}
}
