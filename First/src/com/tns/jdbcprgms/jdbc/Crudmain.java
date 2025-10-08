package com.tns.jdbcprgms.jdbc;
import java.sql.*;
public class Crudmain {
	  private static final String URL = "jdbc:mysql://localhost:3306/teegala";
	    private static final String USER = "root";
	    private static final String PASS = "route";

	    public static void main(String[] args) {

	        try {
	            // Load driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver loaded successfully!");

	            // Establish connection
	            try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {
	                System.out.println("Connected to Database!\n");

	                // Perform CRUD operations
	                InsertStudent insert = new InsertStudent(con);
	                UpdateStudent update = new UpdateStudent(con);
	                DeleteStudent delete = new DeleteStudent(con);
	                DisplayStudent display = new DisplayStudent(con);

	                insert.execute(102, "mani");
	                insert.execute(103, "gambheera");

	                display.execute();

	                update.execute(102, "ojas");
	                display.execute();

	                delete.execute(102);
	                display.execute();

	            }

	        } catch (ClassNotFoundException e) {
	            System.out.println("MySQL JDBC Driver not found!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
