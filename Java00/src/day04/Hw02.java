package day04;

/*
 	두 수를 입력받은 후 
 	두 수의 최소 공배수를 구해서 출력해주는 프로그램을 작성하세요.
 	
 	최소공배수 : 두 수로 나누어 떨어지는 가장 작은 수 
 */
import java.util.*;
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 숫자를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.println("2. 숫자를 입력하세요. : ");
		int num2 = sc.nextInt();
		
		if(num2 > num1) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		for(int i = num2; i > 0; i--) {
			if(num1 % i == 0 && num2 % i ==0) {
				int result = num1 * num2 / i;
				System.out.println(num1 + "과 " + num2 + "의 최소공배수는 " + result + "입니다.");
				break;
				
			}

	}

}
}
