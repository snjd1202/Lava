package day08;

import java.util.Arrays;

/*
 	���� 3]
	2�� ��������
	������ ������ ����� �߰��ؼ� �����Ϸ��� �Ѵ�.
	2�� ������ �迭�� ���̸� �������Ѽ� ó���ϼ���.
		 			
		 		���]
		 			System.arraycopy(#1, #2, #3, #4, #5);
		 				
		 				#1 - ���� �������� �ּ� 
		 				#2 - ���� �������� ���縦 ������ ��ġ 
		 				#3 - ���� ���� �迭�� �ּ�
		 				#4 - ���� ���� �迭�� �Է� ������ġ
		 				#5 - ���� ���� �������� ����

 */
public class Ex03 {

	public static void main(String[] args) {
		String[] name = {"�����", "������", "����ö", "������", "�輺��"};
		String[] sub = {"����", "����", "����", "����", "����"};
		double[][] copy = new double[5][8];
		
		
		int [][] arr = new int[5][6];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 6; j++) {
				arr[i][0] = 1000 + i;
				int score = (int)(Math.random() * 100 -1 + 1 )+1; 
				arr[i][j] = score;
			}
		}
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				copy[i][j] = arr[i][j];
				if(j != 0) {
				copy[i][6] += arr[i][j];
				}
			}
			copy[i][7] = copy[i][6] / 5;
		}
//		System.out.print(copy);
		
		for(int i = 0; i < copy.length; i++) {
			System.out.println("---------------------------------------------------------");
			for(int j = 0; j < copy[i].length; j++) {
		System.out.printf(copy[i][j] + " | ");
			}
			System.out.println();
		}
	}
}

