package controller;

/*
 	1. 사원 이름을 입력하면
 	해당 사원의 사원번호, 이름, 입사일, 급여를 조회해서
 	출력해주는 프로그램을 작성하세요.
 	
 	2. 입사하는 사원의 정보를 입력하는 기능을 구현하세요.
 	
 	3. 사원의 급여를 수정해주는 기능을 구현하세요.
 	 
 */
import dao.*;
import vo.*;
import sql.*;
import java.util.*;
import javax.swing.*;
public class MainCont {
	public MainCont() {
		String code = JOptionPane.showInputDialog("코드를 입력하세요. \n사원정보 : 1001 \n사원추가 : 2001 \n급여수정 : 3001");
		int num = Integer.parseInt(code);
		if(num==1001) {
			ScottDao dao = new ScottDao();
			EmpVO eVO = new EmpVO();
			String name = JOptionPane.showInputDialog("이름을 입력하세요.");
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
				JOptionPane.showMessageDialog(null, eVO.getEname() + " 님이 가입했습니다.");
			} else {
				JOptionPane.showMessageDialog(null, eVO.getEname() + " 님이 가입이 거절되었습니다.");
			}
		} else if(num == 3001) {
			ScottDao dao = new ScottDao();
			EmpVO eVO = new EmpVO();
			String no = JOptionPane.showInputDialog("사원번호를 입력하세요.");
			String sal = JOptionPane.showInputDialog("변경할 금액을 입력하세요.");
			int no1 = Integer.parseInt(no);
			int money = Integer.parseInt(sal);
			eVO.setEmpno(no1);
			eVO.setSal(money);
			int cnt = dao.modi(eVO);
			if(cnt == 1) {
				JOptionPane.showMessageDialog(null, eVO.getSal() + " 로 변경되었습니다.");
			} else {
				JOptionPane.showMessageDialog(null, " 변경이 거절되었습니다.");
			}
			
		}
		
				
	}

	public static void main(String[] args) {
		new MainCont();
	}
}
