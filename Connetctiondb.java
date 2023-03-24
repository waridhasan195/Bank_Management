package Bank_Management;
import java.sql.*;

public class Connetctiondb {

    Connection c;
    Statement s;
    
    public Connetctiondb(){
        try{
            // Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "01735");
            s = c.createStatement();
            
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

}
