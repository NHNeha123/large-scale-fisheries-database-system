/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fisheries.database;

/**
 *
 * @author Neha
 *
 */
import java.sql.*;

public class test {
    public static void main(String args[]){
     Connection con = null;
        PreparedStatement p = null;
        ResultSet rs = null;
 
        con =connection.getCon();
 
        // Try block to catch exception/s
        try {
 
            // SQL command data stored in String datatype
            String sql = "select * from fish";
            p = con.prepareStatement(sql);
            rs = p.executeQuery();
 
            // Printing ID, name, email of customers
            // of the SQL command above
           System.out.println("sucess");
 
            // Condiion check
        
            
        }
 
        // Catch block to handle exception
        catch (SQLException e) {
 
            // Print exception pop-up on scrreen
            System.out.println(e);
        }
    }
}
    
    

