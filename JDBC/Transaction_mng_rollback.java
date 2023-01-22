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
public class Transaction_mng_rollback
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
            String sql="insert into stud2 values('CD',10)";
        int rows=stmt.executeUpdate(sql);
         System.out.println("successfully inserted"+rows+"");
        Scanner sc=new Scanner(System.in);
       String r=sc.next();
        if(r.equals("r"))
        {
            conn.rollback();
        }
        if(r.equals("c"))
        {
            conn.commit();
        }
       
    }
}



}

    
        
        
    