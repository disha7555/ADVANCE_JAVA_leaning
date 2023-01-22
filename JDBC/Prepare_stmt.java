/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.sql.*;
/**
 *
 * @author Welcome
 */
public class Prepare_stmt 
{
    public static void main(String args[]) throws Exception
    {
        String urldb = "jdbc:mysql://localhost:3306/Student1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(urldb,"root","");
        if(conn!=null)
        {
            
            System.out.println("connectin successful");
            String sql="insert into stud1 values(22,'pqr')";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            int rows=pstmt.executeUpdate();
            System.out.println(rows);
        }
    }
}


