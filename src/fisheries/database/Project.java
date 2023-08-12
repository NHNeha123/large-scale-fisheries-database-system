/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fisheries.database;
import java.sql.DriverManager;
import java.sql.Connection;

public class Project {
       public static Connection getCon(){
          
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/fish","root","neha123");
            System.out.println("connected");
            return con;
        }
        catch(Exception e){
           

            return null;
        }
    }
}