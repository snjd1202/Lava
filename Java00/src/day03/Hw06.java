package day03;
/*
 	���� 6]
		������ �⵵�� �Է¹޾Ƽ� 
		�ش� �⵵�� �������� ������� �Ǻ��ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
		
		��, ���׿����ڸ� ����ؼ� ó���ϼ���.
		
		������ ����]
			4�� ���� ��������, 100���� ���� �������� ������,
			400���� ���� �������� �ظ� �����̶�� �Ѵ�.
 */

import java.util.*;
public class Hw06 {
	public Hw06() {
		solv();
	}
	
	// ���� �Ǻ��ϴ� �Լ�
	public void solv() {
		// 1. �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		// 2. �޼��� ���
		System.out.print("�⵵�� �Է��ϼ���. : ");
		// 3. �Է��� ���� ������ ���
		int year = sc.nextInt();
		// 4. �������� ������� �Ǻ��ϰ�
		String result = (year % 4 != 0) ? ("����Դϴ�.") : (year % 100 != 0) ? ("�����Դϴ�.") : (
				(year % 400 == 0) ? ("�����Դϴ�.") : ("����Դϴ�.")
				);
		// 5. ����ϰ�
		System.out.println("�Է��� �� " + year + "���� " + result);
	}
	public static void main(String[] args) {
		new Hw06();
	}

}
