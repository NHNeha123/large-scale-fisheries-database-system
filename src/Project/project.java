package Project;
import java.sql.*;

/**
 *

 */
import java.sql.Connection;
public class project {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/fisheries","root","neha123");
            System.out.println("connected");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
