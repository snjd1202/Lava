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
import java.util.*;
import javax.swing.*;
public class MainCont {

	public MainCont() {
		EmpVO eVO = new EmpVO();
		eVO.setEmpno(8000);
		eVO.setEname("KIMSUJIN");
		eVO.setJob("MANAGER");
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
				
	}

	public static void main(String[] args) {
		new MainCont();
	}

}
