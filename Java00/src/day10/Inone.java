package day10;
	
/*
	 	��  4]
	
	�л��� ������ �Է��ϸ� ������ ������ִ� ���α׷��� �����ϼ���.
	
	��ȭ]
		�����ϰ� �ο����� ����� 
		�� �ο��� ��ŭ ������ �����ϰ� ���� 
		�Լ��� �����ϰ� �ϼ���.
	 */
import javax.swing.*;
import java.util.*;
public class Inone {
	int sum;
	int inone = (int)(Math.random()*(5-2+1)+2);
	int num;
	int[][] arr = new int[inone][inone];

//	public int input(int...no) {
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				num = (int)(Math.random() * (100-1+1) +1);
//				arr[i][j] = num;
//			}
//		}
//		System.out.println();
//		return arr.length;
//	}
	
	public void jumsu() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				num = (int)(Math.random()*(100 - 1 +1) +1);
				arr[i][j]= num;
			}
		}
	}
	
	public void setSum() {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			
		}
		sum = total;
	}
	
	public void toPrint() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
//				System.out.println("���� : " + arr[i][j] + " ���� : " + sum);
//		System.out.print(Arrays.deepToString(arr));
				
			}
			System.out.println("���� : " + sum);
			System.out.println();
		}
	}
				
	

}
