package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddImage {
	public static void main(String[] args) throws Exception {
      try(Connection con = DBUtil.getConnection()){
          String inserImg = "INSERT INTO MY_IMAGES(IMAGE_ID,IMAGE_DATA) VALUES(?,?)";	  
          PreparedStatement pstmt = con.prepareStatement(inserImg);
          pstmt.setInt(1, 111);
          FileInputStream fis = new FileInputStream("D:/Penguins.jpg");
          pstmt.setBinaryStream(2, fis, fis.available());
          
          pstmt.executeUpdate();
          System.out.println("Image added successfully.........");
      }
      
	}
}
