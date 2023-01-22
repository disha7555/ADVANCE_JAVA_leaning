package JDBC;
import java.sql.*;
public class Resultset_metadata
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
         Statement stmt=conn.createStatement();
         ResultSet rs=stmt.executeQuery(sql);
         ResultSetMetaData rsmd=rs.getMetaData();
         System.out.println(rsmd.getTableName(2));
         System.out.println(rsmd.getClass());
         System.out.println(rsmd.getColumnCount());
         System.out.println(rsmd.getColumnLabel(2));
         System.out.println(rsmd.getColumnType(1));
         System.out.println(rsmd.getColumnTypeName(2));
         
         
        }
    }
}


