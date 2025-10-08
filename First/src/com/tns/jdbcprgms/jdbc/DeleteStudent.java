package com.tns.jdbcprgms.jdbc;
import java.sql.*;
public class DeleteStudent {
	private Connection con;

    public DeleteStudent(Connection con) {
        this.con = con;
    }

    public void execute(int sid) throws SQLException {
        String sql = "DELETE FROM student WHERE sid = ?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setInt(1, sid);
            int rows = pst.executeUpdate();
            System.out.println(rows + " record(s) deleted: SID=" + sid);
        }
    }

}
