package jdbc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetImage {
	public static void main(String[] args) throws Exception {
      try(Connection con = DBUtil.getConnection()){
    	  
          String selectImg = "SELECT IMAGE_DATA FROM MY_IMAGES WHERE IMAGE_ID=?";	  
          
          PreparedStatement pstmt = con.prepareStatement(selectImg);
          pstmt.setInt(1, 111);
          ResultSet rs = pstmt.executeQuery();
          rs.next();
          InputStream is = rs.getBinaryStream("IMAGE_DATA");
          FileOutputStream fos  = new FileOutputStream("D:/Penguins-fromdb.jpg");
          int data;
          
          while((data = is.read()) != -1){
        	fos.write(data);  
          }
          fos.close();
          
          System.out.println("got the image successfully.........");
      }
      
	}
}
