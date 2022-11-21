package  hotelbooking;
import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;// query golo execute korar jono
    Conn(){  
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            c =DriverManager.getConnection("jdbc:mysql:/// booking","root","12345678");
            s =c.createStatement();
           
           
        }
        catch(Exception e){ 
           e.printStackTrace();
        }  
    }  
}  