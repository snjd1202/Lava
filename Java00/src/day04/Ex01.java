package day04;

/*
 	4자리 숫자로 된 년도를 입력받아서 
 	윤년인지 평년인지 판단해서 출력하세요.
 	단, switch ~ case 구문으로 처리하세요.
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요. : ");
		int year = sc.nextInt();
		int code = 0;
		if(year % 400 ==0) {
			code = 1;
		} else if(year % 100 == 0) {
			code = 2;
		} else if(year % 4 == 0) {
			code = 3;
		}
		
		switch(code) {
		case 1:
			System.out.println("윤년입니다.");
		break;
		case 2:
			System.out.println("평년입니다.");
		break;
		case 3:
			System.out.println("윤년입니다.");
		break;
		default:
			System.out.println("평년입니다.");
		}
		
	}

}
