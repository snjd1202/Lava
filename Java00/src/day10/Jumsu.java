package day10;

import java.util.Arrays;

/*
 	���� 2]
	
	10���� ������ ������ �Է��� �迭�� ����� (�迭�� ���̴� 10���� �Ѵ�.)
	�� �迭�� ��� ������ 
	����, ����� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� �����ؼ� ó���ϼ���.
 */
public class Jumsu {
	int[] score;
	double sum;
	double avg;
	int no;
	
	public void setJum() {
		score = new int[10];
		for(int i = 0; i < score.length; i++) {
			int no = (int)(Math.random()*(100-1+1)+1);
			score[i] = no;
		}
}
	public void setSum() {
		int total = 0 ;
		for(int i = 0; i < score.length; i++) {
			total += score[i]; 
		}
		
		sum = total;
		
	}
	public void setAvg() {
		avg = sum/10;
		
	}
	
	public void toPrint() {
		System.out.println("���� : " + Arrays.toString(score) + " ���� : " + sum + " ���� : " + avg);
	}
	
	

}
