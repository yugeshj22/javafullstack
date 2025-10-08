package com.tns.jdbcprgms.jdbc;
import java.sql.*;
public class Crudjdbc {
	public static void main(String[] args) {
	 String url = "jdbc:mysql://localhost:3306/teegala";  // your DB
     String user = "root";  
     String pass = "route";

    		    try {
    		        // Load MySQL JDBC driver
    		        Class.forName("com.mysql.cj.jdbc.Driver");
    		        System.out.println("Driver loaded successfully!");

    		        try (Connection con = DriverManager.getConnection(url, user, pass)) {
    		            System.out.println("Connected to Database!");

    		            // Insert, Update, Delete, Display
    		            insertRecord(con, 101, "Alice");
    		            insertRecord(con, 102, "Bob");
    		            displayRecords(con);
    		            updateRecord(con, 101, "Alicia");
    		            displayRecords(con);
    		            deleteRecord(con, 102);
    		            displayRecords(con);
    		        }

    		    } catch (ClassNotFoundException e) {
    		        System.out.println("MySQL JDBC Driver not found!");
    		        e.printStackTrace();
    		    } catch (SQLException e) {
    		        e.printStackTrace();
    		    }
 }

 private static void insertRecord(Connection con, int sid, String sname) throws SQLException {
     String sql = "INSERT INTO student (sid, sname) VALUES (?, ?)";
     try (PreparedStatement pst = con.prepareStatement(sql)) {
         pst.setInt(1, sid);
         pst.setString(2, sname);
         int rows = pst.executeUpdate();
         System.out.println(rows + " record(s) inserted: SID=" + sid + ", SNAME=" + sname);
     }
 }

 private static void updateRecord(Connection con, int sid, String sname) throws SQLException {
     String sql = "UPDATE student SET sname = ? WHERE sid = ?";
     try (PreparedStatement pst = con.prepareStatement(sql)) {
         pst.setString(1, sname);
         pst.setInt(2, sid);
         int rows = pst.executeUpdate();
         System.out.println(rows + " record(s) updated: SID=" + sid + " to SNAME=" + sname);
     }
 }

 private static void deleteRecord(Connection con, int sid) throws SQLException {
     String sql = "DELETE FROM student WHERE sid = ?";
     try (PreparedStatement pst = con.prepareStatement(sql)) {
         pst.setInt(1, sid);
         int rows = pst.executeUpdate();
         System.out.println(rows + " record(s) deleted: SID=" + sid);
     }
 }

 private static void displayRecords(Connection con) throws SQLException {
     String sql = "SELECT * FROM student";
     try (Statement st = con.createStatement();
          ResultSet rs = st.executeQuery(sql)) {

         System.out.println("\n--- Student Records ---");
         System.out.printf("%-5s %-20s%n", "SID", "SNAME");
         System.out.println("------------------------");
         while (rs.next()) {
             System.out.printf("%-5d %-20s%n",
                     rs.getInt("sid"),
                     rs.getString("sname"));
         }
     }
 }
}
