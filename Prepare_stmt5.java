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
public class Prepare_stmt5
{
    public static void main(String args[]) throws Exception
    {
        String urldb = "jdbc:mysql://localhost:3306/Student1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(urldb,"root","");
        if(conn!=null)
        {
            
            System.out.println("connectin successful");
            sql="SELECT * FROM Stud";
            stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            if(rs.)
            CallableStatement clbstmt=conn.prepareCall("CALL trial()");
           boolean b=clbstmt.execute();
         
        }
    }
}


