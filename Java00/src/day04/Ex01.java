package day04;

/*
 	4�ڸ� ���ڷ� �� �⵵�� �Է¹޾Ƽ� 
 	�������� ������� �Ǵ��ؼ� ����ϼ���.
 	��, switch ~ case �������� ó���ϼ���.
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ���. : ");
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
			System.out.println("�����Դϴ�.");
		break;
		case 2:
			System.out.println("����Դϴ�.");
		break;
		case 3:
			System.out.println("�����Դϴ�.");
		break;
		default:
			System.out.println("����Դϴ�.");
		}
		
	}

}
