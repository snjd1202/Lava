package dao;

import DB.*;
import java.sql.*;
import java.util.*;
import vo.*;
import sql.*;

public class ScottDao {
	SCOTTJDBC db;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	ScottSQL mSQL;
	
	public ScottDao() {
		db = new SCOTTJDBC();
		con = db.getCon();
		mSQL= new ScottSQL();
	}
	public int addMember(EmpVO vo) {
		int cnt = 0;
		String sql = mSQL.getSQL(mSQL.SADD);
		pstmt = db.getPSTMT(sql);
		
		try {
			pstmt.setString(1, vo.getEname());
			pstmt.setString(2, vo.getJob());
			pstmt.setInt(3, vo.getMgr());
			pstmt.setInt(4, vo.getSal());
			pstmt.setInt(5, vo.getComm());
			pstmt.setInt(6, vo.getDeptno());
			
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
	
	public void showInfo(EmpVO vo) {
		String sql = mSQL.getSQL(mSQL.SNAME);
		pstmt = db.getPSTMT(sql);
		// 사원번호, 이름, 입사일, 급여
		try {
			pstmt.setString(1, vo.getEname());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				vo.setEmpno(rs.getInt("empno"));
				vo.setEname(rs.getString("ename"));
				vo.setJoinDate(rs.getDate("hiredate"));
				vo.setSal(rs.getInt("sal"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
			db.close(rs);
		}
	}
	
	public int modi(EmpVO vo) {
		String sql = mSQL.getSQL(mSQL.SSAL);
		pstmt = db.getPSTMT(sql);
		int cnt = 0;
		try {
			pstmt.setInt(1, vo.getSal());
			pstmt.setInt(2, vo.getEmpno());
			cnt = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
}
