package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class CallProsedure {
public static void main(String[] args) throws Exception {
	try(Connection con = DBUtil.getConnection()){
		CallableStatement call = con.prepareCall("{call getStudentName(?,?) }");
		call.setInt(1, 1);// input
		call.registerOutParameter(2, Types.VARCHAR);// output
		call.executeQuery();
		System.out.println("Name is "+call.getString(2));
	}
}
}
