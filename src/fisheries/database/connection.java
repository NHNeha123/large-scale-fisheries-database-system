package fisheries.database;

// Java Program to Retrieve Contents of a Table Using JDBC
// connection

// Showing linking of created database

// Importing SQL libraries to create database

import java.sql.*;

public class connection {

   public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

	Connection con = null;

	public static Connection connectDB()

	{

		try {
			// Importing and registering drivers
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3307/fisheries/user=root",
				"root", "neha123");
			// here,root is the username and 1234 is the
			// password,you can set your own username and
			// password.
                        System.out.println("here");
			return con;
		}
		catch (Exception e) {
                        System.out.println("here");
			System.out.println(e);
		}
            return null;
	}
}
