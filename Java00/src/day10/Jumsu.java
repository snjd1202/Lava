package day10;

import java.util.Arrays;

/*
 	문제 2]
	
	10개의 과목의 점수를 입력할 배열을 만들고 (배열의 길이는 10으로 한다.)
	그 배열에 담긴 점수의 
	총점, 평균을 구해서 출력해주는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요.
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
		System.out.println("점수 : " + Arrays.toString(score) + " 총점 : " + sum + " 평점 : " + avg);
	}
	
	

}
