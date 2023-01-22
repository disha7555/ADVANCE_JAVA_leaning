/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;



import java.sql.*;

public class Transaction_mng
{
    
     public static void main(String args[]) throws Exception
    {
        String urldb = "jdbc:mysql://localhost:3306/Student1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(urldb,"root","");
        if(conn!=null)
        {
         System.out.println("connectin successful");
         String sql="insert into stud2 values('ghfghgfgf',6);";
        conn.setAutoCommit(false);
            Statement stmt=conn.createStatement();
           
        int rows=stmt.executeUpdate(sql);
        System.out.println(rows);
        conn.commit();
    }
}



}
