package day09;

import java.util.Arrays;

/*
 	문제 2]
	1차 배열에 10개의 데이터를 입력한 후 
	총점과 평균을 구하는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수로 처리하세요.
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
		System.out.println("점수 : " + Arrays.toString(arr) + " 총점 : " + sum + " 평균 : " + avg);
	}
	
}
