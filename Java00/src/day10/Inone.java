package day10;
	
/*
	 	문  4]
	
	학생의 점수를 입력하면 총점을 계산해주는 프로그램을 제작하세요.
	
	심화]
		랜덤하게 인원수를 만들고 
		그 인원수 만큼 점수를 랜덤하게 만들어서 
		함수를 실행하게 하세요.
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
//				System.out.println("점수 : " + arr[i][j] + " 총점 : " + sum);
//		System.out.print(Arrays.deepToString(arr));
				
			}
			System.out.println("총점 : " + sum);
			System.out.println();
		}
	}
				
	

}
