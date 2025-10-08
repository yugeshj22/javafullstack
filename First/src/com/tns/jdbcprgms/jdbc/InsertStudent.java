package com.tns.jdbcprgms.jdbc;
import java.sql.*;
public class InsertStudent {
	private Connection con;

    public InsertStudent(Connection con) {
        this.con = con;
    }

    public void execute(int sid, String sname) throws SQLException {
        String sql = "INSERT INTO student (sid, sname) VALUES (?, ?)";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, sid);
            pst.setString(2, sname);
            int rows = pst.executeUpdate();
            System.out.println(rows + " record(s) inserted: SID=" + sid + ", SNAME=" + sname);
        }
    }
}
