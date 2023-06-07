package abhisekm;
import java.sql.*;
public class MyConnection {
   public static Connection dbConnect() 
   {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mycollege","root","calm");
          
           System.out.println("Connected");
           return conn;
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       return null;
   }
   
    
}
