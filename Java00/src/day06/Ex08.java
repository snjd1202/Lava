package day06;

/*
 	���� 8]
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� �����, - ���ڿ� �迭 3��
	�����͸� �Է��ؼ� 
	
	ȸ���� �̸��� �Է��ϸ�
	ȸ���� �̸��� ��ȭ��ȣ, �̸����� ������ִ� ���α׷��� �ۼ��ϼ���.
	
 */
import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		String arr1[] = {"�����", "������", "����ö", "������", "�輺��"};
		String arr2[] = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		String arr3[] = {"ksj@increpas.com","sej@increpas.com","lhc@increpas.com","ljs@increpas.com","ksh@increpas.com"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���. : ");
		String str = sc.nextLine();
		
		int idx = 99;
		for(int i = 0 ; i < arr1.length ; i++ ) {
			if(arr1[i].equals(str)) {
				idx = i;
			}
		}
		System.out.println("�̸� : " + arr1[idx]);
		System.out.println("��ȭ��ȣ : " + arr2[idx]);
		System.out.println("�̸��� : " + arr3[idx]);
		
		
		
		for(int i= 0; i < arr1.length; i++) {
				if(str.equals(arr1[i])) {
					System.out.println("�̸� : " + arr1[i]);
					System.out.println("��ȭ��ȣ : " + arr2[i]);
					System.out.println("�̸��� : " + arr3[i]);
			}
			System.out.println();
		}
		

	}

}
