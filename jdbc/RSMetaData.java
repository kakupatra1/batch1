package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;

public class RSMetaData {
	public static void main(String[] args) throws Exception {
		Connection con = DBUtil.getConnection();

		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM STUDENTS");
		ResultSetMetaData rsMetaData = pstmt.getMetaData();
		
		System.out.println("No of colums "+rsMetaData.getColumnCount());
		System.out.println("First Coumn's Name "+rsMetaData.getColumnLabel(1));
		System.out.println("Second Coumn's Name "+rsMetaData.getColumnLabel(2));
		
	}
}
