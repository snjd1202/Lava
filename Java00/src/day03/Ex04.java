package day03;
/*
 	문제 3]
 		부서번호를 입력하면 
 		부서이름을 출력해주는 프로그램을 작성하세요.
 		
 		10 - 총무부
 		20 - 회계부
 		30 - 영업부
 		40 - 기술부
 		나머지 - 꽝
 */
import java.util.*;
public class Ex04 {

	public Ex04() {
		abc();
	}
	
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호를 입력하세요. : ");
		int num1 = sc.nextInt();
		String dept = "";
		if (num1 == 10) {
			dept = "총무부";
		} else if(num1 == 20){
			dept = "회계부";
		} else if(num1 == 30) {
			dept = "영업부";
		} else if(num1 == 40){
			dept = "기술부";
		} else {
			dept = "꽝";
		}
		System.out.println("입력한 부서번호 " + num1 + " 의 부서이름은 " + dept + " 입니다.");
	}
	
	public static void main(String[] args) {
		new Ex04();

	}

}
