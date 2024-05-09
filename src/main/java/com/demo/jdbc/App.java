package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
	static final String DB_URL = "jdbc:mysql://localhost/employee";
	   static final String USER = "root";
	   static final String PASS = "root";
	   
    public static void main( String[] args )
    {
        try {
			Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement st = con.createStatement();
			 // Execute a query    
	         String sql = "INSERT INTO employeeDatas VALUES (101, 'Jenny', 25, 10000)";
	         st.executeUpdate(sql);
	         String sql2 = "INSERT INTO employeeDatas VALUES (102, 'Jacky', 30, 20000)";
	         st.executeUpdate(sql2);
	         String sql3 = "INSERT INTO employeeDatas VALUES (103, 'Joe', 20, 40000)";
	         st.executeUpdate(sql3);
	         String sql4 = "INSERT INTO employeeDatas VALUES (104, 'John', 40, 80000)";
	         st.executeUpdate(sql4);
	         String sql5 = "INSERT INTO employeeDatas VALUES (105, 'shameer', 25, 90000)";
	         st.executeUpdate(sql5);
	         
	         System.out.println("records inserted");  
		} 
        
        catch (SQLException e) {
			e.printStackTrace();
		}
        
    }
}
