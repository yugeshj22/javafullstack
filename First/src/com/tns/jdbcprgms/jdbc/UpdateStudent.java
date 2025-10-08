package com.tns.jdbcprgms.jdbc;
import java.sql.*;
public class UpdateStudent {
	private Connection con;

    public UpdateStudent(Connection con) {
        this.con = con;
    }

    public void execute(int sid, String sname) throws SQLException {
        String sql = "UPDATE student SET sname = ? WHERE sid = ?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, sname);
            pst.setInt(2, sid);
            int rows = pst.executeUpdate();
            System.out.println(rows + " record(s) updated: SID=" + sid + " → SNAME=" + sname);
        }
    }
}
