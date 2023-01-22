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
public class insertDemo 
{
    public static void main(String args[]) throws Exception
    {
        String urldb = "jdbc:mysql://localhost:3306/Student1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(urldb,"root","");
        if(conn!=null)
        {
            
            System.out.println("connectin successful");
            String sql="insert into stud1 values(23,'ABC')";
            Statement stmt=conn.createStatement();
            int rows=stmt.executeUpdate(sql);
            System.out.println(rows);//shows no of rows updated.
        }
    }
}


