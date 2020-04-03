package day20;

/*
 	ȸ������
 		�̸�, ���̵�, ����, �ƹ�Ÿ��ȣ
 	�� ��ȸ�ؼ� �����ּ���.
 */
import java.util.*;
import java.sql.*;
import javax.swing.*;
public class Test03 {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public Test03() {
		dbInit();
		// ���Ǹ�� �ۼ��ϰ�
		String sql = "SELECT name, id, gen, ano FROM member WHERE isshow = 'Y'";
		// Statememt ��������
		
		// ���Ǹ���� �̹� �ϼ��� �Ǿ������� Statement �� �Ǿ ������ ����� ������ �ȴ�.
		StringBuffer buff = new StringBuffer();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			// ���Ǹ���� ����� �������� ���� �ݺ��ؼ� �۾��� ���ָ� �ȴ�.
			while(rs.next()) {
				buff.append(rs.getString("name") + " | ");	// �̸� �ٿ��ְ�
				buff.append(rs.getString("id") + " | ");	// ���̵� �ٿ��ְ�
				buff.append(rs.getString("gen") + " | ");	// ���� �ٿ��ְ�
				buff.append(rs.getInt("ano") + "\n");		// �ƹ�Ÿ��ȣ �ٿ��ְ�
			}
			
			// ��� �����ְ�
			JOptionPane.showMessageDialog(null, buff.toString());
		} catch(Exception e) {
			
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}

	public void dbInit() {
		try {
			// ����̹� �ε��ϰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Ŀ�ؼ� ������
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Test03();
	}

}
