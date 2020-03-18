package day08;

import java.util.Arrays;

/*
 	문제 3]
	2번 문제에서
	점수의 총점과 평균을 추가해서 관리하려고 한다.
	2번 문제의 배열의 길이를 증가시켜서 처리하세요.
		 			
		 		명령]
		 			System.arraycopy(#1, #2, #3, #4, #5);
		 				
		 				#1 - 원본 데이터의 주소 
		 				#2 - 원본 데이터의 복사를 시작할 위치 
		 				#3 - 복사 받을 배열의 주소
		 				#4 - 복사 받을 배열의 입력 시작위치
		 				#5 - 복사 받을 데이터의 갯수

 */
public class Ex03 {

	public static void main(String[] args) {
		String[] name = {"김수진", "손은진", "이한철", "이진수", "김성현"};
		String[] sub = {"국어", "수학", "영어", "물리", "역사"};
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

