/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author Welcome
 */
public class Transaction_savepoint
{
    


    
     public static void main(String args[]) throws Exception
    {
        String urldb = "jdbc:mysql://localhost:3306/Student1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(urldb,"root","");
        if(conn!=null)
        {
         System.out.println("connectin successful");
        
            conn.setAutoCommit(false);
            Statement stmt=conn.createStatement();
            String sql="insert into stud2 values('iCD',10)";
            String sql1="insert into stud2 values('aCD',18)";
            String sql2="insert into stud2 values('yCD',15)";
           int rows=stmt.executeUpdate(sql);
           
           int rows1=stmt.executeUpdate(sql1);
           
           int rows2=stmt.executeUpdate(sql2);
               conn.commit();
           Savepoint sp=conn.setSavepoint("sp1");
             String sql4="insert into stud2 values('rCD',16)";
            String sql5="insert into stud2 values('tCD',17)";
            String sql6="insert into stud2 values('xCD',24)";
         conn.rollback(sp);
         System.out.println("successfully inserted"+rows+"");
     
       
    }
}



}

    
        
        
    
