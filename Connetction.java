package Bank_Management;
import java.sql.*;

public class Connetction {

    Connection c;
    Statement s;
    
    public Connetction(){
        try{
            // Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jbdc:mysql:///bankmanagementsystem", "root", "01735");
            s = c.createStatement();
            
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

}
