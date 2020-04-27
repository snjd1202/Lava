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
			JOptionPane.showMessageDialog(null, eVO.getEname() + " 님이 가입했습니다.");
		} else {
			JOptionPane.showMessageDialog(null, eVO.getEname() + " 님이 가입이 거절되었습니다.");
		}
				
	}

	public static void main(String[] args) {
		new MainCont();
	}

}
