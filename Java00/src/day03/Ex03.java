package day03;
/*
 	문제 2]
 		전기 요금을 계산하는 프로그램을 작성하세요.
 					코드		기본요금		사용요금
 		가정용 		(1)			3800			245
 		산업용 		(2)			2400			157
 		교육용 		(3)			2900			169
 		상업용 		(4)			3200			174
 		
 		전기요금 = 기본요금 + 사용량 * 사용요금
 		
 		사용자코드와 사용량을 입력받아서 
 		전기요금을 계산해주는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex03 {

	public Ex03() {
		abc();
	}
	 
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) 가정용 / (2) 산업용 / (3) 교육용 / (4) 상업용");
		System.out.println("사용자 코드를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.print("사용량을 입력하세요. : ");
		int num2 = sc.nextInt();
		int home = 3800;
		int ind = 2400;
		int edu = 2900;
		int sang = 3200;
		int yogum = 0;
		String use = ""; 
		 
		if(num1 == 1) {
			yogum = home + num2 * 245;
			use = "가정용";
		} else { if(num1 == 2) {
			yogum = ind + num2 * 157;
			use = "산업용";
		} else { if(num1 == 3) {
			yogum = edu + num2 * 167;
			use = "교육용";
		} else {
			yogum = sang + num2 * 174;
			use = "상업용";
		}
			
		}
			
		}
		System.out.println("입력된 " + use + " 코드의 사용량 " + num2 + "은 " + yogum + "원 입니다.");
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
