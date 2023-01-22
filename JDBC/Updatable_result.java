/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.sql.*;

public class Updatable_result {
    
     public static void main(String args[]) throws Exception
    {
        String urldb = "jdbc:mysql://localhost:3306/Student1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(urldb,"root","");
        if(conn!=null)
        {
         System.out.println("connectin successful");
         String sql="select * from stud2";
         Statement stmt;
         stmt=conn.createStatement(1005,1008);
         ResultSet rs=stmt.executeQuery(sql);
         while(rs.next())
         {
             rs.updateInt(1,rs.getInt("id")+5);
             rs.updateRow();
             System.out.println(rs.getInt("id"));
        }
    }
}



}
