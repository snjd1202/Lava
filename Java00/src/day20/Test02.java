package day20;

/*
 	ȸ����ȣ�� �Է��ϸ�
 	�����ͺ��̽��� ȸ�� ������ ��ȸ���ִ� ���α׷��� �ۼ��ϼ���.
 */

import java.sql.*;
import java.util.*;
import javax.swing.*;

public class Test02 {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Test02() {
		dbInit();

		// ȸ����ȣ�� �Է¹޴´�.
		String sno = JOptionPane.showInputDialog("��ȸ�� ȸ����ȣ�� �Է��ϼ���.");
		int no = -1;
		while(true) {
			try{
				no = Integer.parseInt(sno);
				break;
			} catch(Exception e) {
				e.printStackTrace();
				continue;
			}
		}
		// ���Ǹ���� �����.
		String sql = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status  FROM member WHERE mno = " +no;
		String psql = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status  FROM member WHERE mno = ?";
		
		try {
			/*
			// Statement�� ������
			stmt = con.createStatement();
			// ���� ��� �Ǿ ������
			rs = stmt.executeQuery(sql);
			*/
			
			// ? �� ä������ϴ� ���Ǹ���� ����� �� ����ϴ� Statement�� PreparedStatement�̴�.
			pstmt =con.prepareStatement(psql);
			// PreparedStatement �� ���Ǹ���� ������ ������ �ϰ�
			// ������� �Ŀ��� ���Ǹ���� �ϼ��ؾ� ���� ����� ���������� �۵��� ���̴�.
			
			// ���Ǹ�� �ϼ��ϰ� 
			pstmt.setInt(1, no);
			
			// ���Ǹ�� ������ ��� �ް�
			rs = pstmt.executeQuery();
			
			// �۾��� �� �� ������
			rs.next();
			
			// �ʿ��� ������ �ҷ�����
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("email");
			String gen = rs.getString("gen");
			String tel = rs.getString("HP");
			int ano = rs.getInt("avatarno");
			char isshow = rs.getString("status").charAt(0);

			// �����ְ�
			JOptionPane.showMessageDialog(null, name+ ((name.equals("������")) ?" ������ ": (name.equals("�����")? " ȸ��� ": " �� ") )+ "����\nȸ����ȣ : " + mno + 
												"\nȸ�����̵� : " + mid + "\nȸ����� : " + mpw +
												"\nȸ������ : " + mail + "\nȸ������ : " + gen + 
												"\nȸ����ȭ : " + tel + "\n�ƹ�Ÿ��ȣ : " + ano + 
												"\nȰ������ : " + ((isshow == 'Y')? "Ȱ����" : "Ż��ȸ��")
										);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 
	}
	// �����ͺ��̽� ����̹� �ε��ϰ� Ŀ�ؼ� ����ִ� �Լ�
	public void dbInit() {
		try {
			// ����̹� �ε��ϰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Ŀ�ؼ� ������
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("*** Ŀ�ؼ� ������ ���� ***");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				stmt.close();
				con.close();
			} catch(Exception e) {}
		}
	}
	public static void main(String[] args) {
		new Test02();
	}

}
