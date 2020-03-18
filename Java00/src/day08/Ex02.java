package day08;

import java.util.Arrays;

/*
	 문제 2]
		국어, 수학, 영어, 물리, 역사 점수를 관리하려고 한다. (점수는 랜덤하게 추출하세요.)
		학생의 수는 5명이고 , 
		2차원 배열로 만들어서 
		5명의 점수를 저장할 배열을 만드세요.
 */
public class Ex02 {

	public static void main(String[] args) {
//		String[] name = {"김수진", "손은진", "이한철", "이진수", "김성현"};
//		String[] sub = {"국어", "수학", "영어", "물리", "역사"};
		
		
		int [][] arr = new int[5][6];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 6; j++) {
				arr[i][0] = 1000 + i;
				int score = (int)(Math.random() * 100 -1 + 1 )+1; 
				arr[i][j] = score;
			}
			
//			int stu = arr[i][0];
//			System.out.println(stu + score);
			
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("-------------------------");
			for(int j = 0; j < arr[i].length; j++) {
		System.out.printf("%3d|", arr[i][j]);
				
			}
			System.out.println();
//			System.out.println(Arrays.toString(arr));
		}
		
		
	}
	

}
