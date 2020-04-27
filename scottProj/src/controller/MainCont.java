package controller;

/*
 	1. ��� �̸��� �Է��ϸ�
 	�ش� ����� �����ȣ, �̸�, �Ի���, �޿��� ��ȸ�ؼ�
 	������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	2. �Ի��ϴ� ����� ������ �Է��ϴ� ����� �����ϼ���.
 	
 	3. ����� �޿��� �������ִ� ����� �����ϼ���.
 	 
 */
import dao.*;
import vo.*;
import sql.*;
import java.util.*;
import javax.swing.*;
public class MainCont {
	public MainCont() {
		String code = JOptionPane.showInputDialog("�ڵ带 �Է��ϼ���. \n������� : 1001 \n����߰� : 2001 \n�޿����� : 3001");
		int num = Integer.parseInt(code);
		if(num==1001) {
			ScottDao dao = new ScottDao();
			EmpVO eVO = new EmpVO();
			String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
			eVO.setEname(name);
			dao.showInfo(eVO);
			String msg = "Empno : " + eVO.getEmpno()+  "\n" + "Ename : " + eVO.getEname() + "\n" +  "HireDate : " + eVO.getJoinDate() + "\n" + "Sal : " + eVO.getSal();
			JOptionPane.showMessageDialog(null, msg);
		}else if(num == 2001) {
			EmpVO eVO = new EmpVO();
			eVO.setEmpno(8000);
			eVO.setEname("KIMSUJIN");
			eVO.setJob("MANAGER");
			eVO.setMgr(7839);
			eVO.setJoinDate(null);
//		eVO.setJoinTime(null);
			eVO.setSal(10000);
			eVO.setComm(5000);
			eVO.setDeptno(10);
			
			ScottDao mDao = new ScottDao();
			
			int cnt = mDao.addMember(eVO);
			
			if(cnt == 1) {
				JOptionPane.showMessageDialog(null, eVO.getEname() + " ���� �����߽��ϴ�.");
			} else {
				JOptionPane.showMessageDialog(null, eVO.getEname() + " ���� ������ �����Ǿ����ϴ�.");
			}
		} else if(num == 3001) {
			ScottDao dao = new ScottDao();
			EmpVO eVO = new EmpVO();
			String no = JOptionPane.showInputDialog("�����ȣ�� �Է��ϼ���.");
			String sal = JOptionPane.showInputDialog("������ �ݾ��� �Է��ϼ���.");
			int no1 = Integer.parseInt(no);
			int money = Integer.parseInt(sal);
			eVO.setEmpno(no1);
			eVO.setSal(money);
			int cnt = dao.modi(eVO);
			if(cnt == 1) {
				JOptionPane.showMessageDialog(null, eVO.getSal() + " �� ����Ǿ����ϴ�.");
			} else {
				JOptionPane.showMessageDialog(null, " ������ �����Ǿ����ϴ�.");
			}
			
		}
		
				
	}

	public static void main(String[] args) {
		new MainCont();
	}
}
