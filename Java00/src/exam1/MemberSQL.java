package exam1;

import java.sql.*;
public class MemberSQL {
	String sql1 = "select name, gender from member where id = ?";
	String sql2 = "update member set age = ? where id = ?";
	final int SELECT = 1001;
	final int UPDATE = 2001;

	
	public MemberSQL() {
		
	}
	
	public String getSQL(int SQLcode) {
		String sql = "";
		switch (SQLcode) {
		case 1001:
			sql = sql1;
			break;
		case 2001:
			sql =  sql2;
			break;
		}
		return sql;
		
	}
	public static void main(String[] args) {
		MemberSQL s1 = new MemberSQL();
		String str = s1.getSQL(s1.SELECT);
		String str1 = s1.getSQL(s1.UPDATE);
		System.out.println(str);
		System.out.println(str1);
	}
}
