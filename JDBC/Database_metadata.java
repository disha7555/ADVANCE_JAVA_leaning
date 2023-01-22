/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;
import java.sql.*;
public class Database_metadata
{
    public static void main(String args[]) throws Exception
    {
        String urldb = "jdbc:mysql://localhost:3306/Student1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(urldb,"root","");
        if(conn!=null)
        {
            
         System.out.println("connectin successful");
         String sql="SELECT * FROM STUD1";
         DatabaseMetaData dbmd=conn.getMetaData();
         System.out.println(dbmd.getDatabaseProductName());
          System.out.println(dbmd.getDatabaseProductVersion());
           System.out.println(dbmd.getURL());
            System.out.println(dbmd.getUserName());
             System.out.println(dbmd.getDriverName());
             System.out.println(dbmd.getDriverVersion());
              System.out.println(dbmd.supportsBatchUpdates());
               System.out.println(dbmd.supportsSavepoints());
                  System.out.println(dbmd.supportsStoredProcedures());
               
              
              
             
        
        }
    }
}


