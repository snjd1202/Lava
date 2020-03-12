package day04;

import java.util.*;
public class Ex04 {
/*
 	���� 4]
 		�ټ��ڸ� ������ �Է¹޾Ƽ� 
 		�� ���ڰ� ȸ�������� �ƴ��� �Ǻ��ؼ� ����ϼ���.
 		
 		ȸ������?
 			�տ��� ������ �ڿ��� ������ �Ȱ��� ���� ȸ������ �Ѵ�.
 			��]
 				12321 - ȸ����
 				12312 - ȸ���� �ƴ�
 				
 		����]
 			���ڿ�.charAt(��ġ��) - ���ڿ��� Ư�� ��ġ�� ���ڸ� ��ȯ���ִ� �Լ�
 			"acb".charAt(2)
 			������.toCharArray()  - ���ڿ��� ���ڹ迭�� ��ȯ���ִ� �Լ�
 			"abc".toCharArray()[2]
 			
 		�ݺ��� ������]
 			1. break		- �ݺ��� �Ǵ� switch ���� �����Ű�� ���
 			
 			2. continue		- �ݺ����� �ٽ� �����Ű�� ���
 			
 				for(1; 2; 3){
 					4
 					continue;
 					5
 				}
 				���� : 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> ...
 				
 				while(1) {
 					2
 					continue;
 					3
 				}
 				���� : 1 -> 2 -> 1 -> 2 -> 1 -> ...
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5�ڸ� ������ �Է��ϼ���. : ");
		String msg = "ȸ����";
		String str = sc.nextLine();
		for(int i = 0; i < str.length() / 2; i++) {
			// ���ڿ� �� ���ڸ� ù ���ں��� ������ �ڿ������� ���ڿ� ���Ѵ�.
			if(str.charAt(i) == str.charAt((str.length() - 1) - i)) {
				// �� ���� �� ���ڰ� ������� �̹Ƿ� ���� ���ڸ� ������ ���ؾ��Ѵ�.
				continue;
			}
			// �� ���� �� ���ڰ� �ٸ� ��� �̹Ƿ� ȸ������ �ƴϰԵȴ�.
			msg = "ȸ������ �ƴ� ��";
			break;
		}
		System.out.println(msg);
	}

}
