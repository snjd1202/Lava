package day04;

/*
 	�� ���� �Է¹��� ��
 	�� ���� �ִ� ������� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	�ִ����� : �� ���� ���� �� �ִ� �ִ� ��
 */
import java.util.*;
public class Hw01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ���ڸ� �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		System.out.println("2. ���ڸ� �Է��ϼ���. : ");
		int num2 = sc.nextInt();
			
		if(num2 > num1) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		for(int i = num2; i > 0; i--) {
			if(num1 % i == 0 && num2 % i ==0) {
				System.out.println(num1 + " �� " + num2 + " �� �ִ������� " + i + " �Դϴ�.");
				break;
			}
		}
				
		}

}
