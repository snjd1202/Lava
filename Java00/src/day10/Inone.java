package day10;
	
/*
	 	문제 4]
	
	학생의 점수를 입력하면 총점을 계산해주는 프로그램을 제작하세요.
	
	심화]
		랜덤하게 인원수를 만들고 
		그 인원수 만큼 점수를 랜덤하게 만들어서 
		함수를 실행하게 하세요.
	 */
import javax.swing.*;
import java.util.*;
public class Inone {
	int jumsu;
	
	
	// 점수 입력
	public void ipruk(int...no) {
		
		for(int i = 0; i < no.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("점수를 입력하세요. : ");
			jumsu = sc.nextInt();
			
		}
				
	}
//	public int getSum() {
//		int no 
//	}

}
