package com.tns.jdbcprgms.jdbc;
import java.sql.*;

public class DisplayStudent {
    private Connection con;

    public DisplayStudent(Connection con) {
        this.con = con;
    }

    public void execute() throws SQLException {
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
            System.out.println();
        }
    }
}
