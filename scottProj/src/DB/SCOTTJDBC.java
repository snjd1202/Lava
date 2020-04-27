package DB;

import java.sql.*;
public class SCOTTJDBC {
	Connection con = null;
	public SCOTTJDBC() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch(Exception e) {
				e.printStackTrace();
			}
	}

	public Connection getCon() {
		return getCon("scott","tiger");
		}
	public Connection getCon(String user, String pw) {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
		this.con = con;
		return con;
	}
	
	public Statement getSTMT(String sql) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public PreparedStatement getPSTMT(String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection)o).close();
			} else if(o instanceof Statement) {
				((Connection)o).close();
			} else if(o instanceof PreparedStatement) {
				((Connection)o).close();
			} else if(o instanceof ResultSet) {
				((Connection)o).close();
			}
			
		} catch(Exception e) {}
	}
}
