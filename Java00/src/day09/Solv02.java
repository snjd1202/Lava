package day09;

import java.util.Arrays;

/*
 	���� 2]
	1�� �迭�� 10���� �����͸� �Է��� �� 
	������ ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� ó���ϼ���.
 */
public class Solv02 {
	int[] arr = new int[10];
	int num;
	double sum;
	double avg;
	
	public void jumsu() {
		for(int i = 0; i < 10; i++) {
			num = (int)(Math.random() * (100 - 1 + 1) + 1);
			arr[i] = num;
		}
	}
	
	public void setSum() {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			 total += arr[i];
		}
		sum = total;
	}
	
	public void setAvg() {
		avg = sum / 10;
	}
	
	public void setPrint() {
		System.out.println("���� : " + Arrays.toString(arr) + " ���� : " + sum + " ��� : " + avg);
	}
	
}
