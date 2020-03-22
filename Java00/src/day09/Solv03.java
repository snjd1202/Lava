package day09;

import java.util.Arrays;

/*
 	문제 3]
	다섯 학생의 국어, 영어, 수학, 물리, 국사 점수를 입력받아서 
	총점과 석차를 구하는 프로그램을 작성하세요.
	단, 입력, 총점계산, 석차계산, 출력은 함수로 처리하세요.
	
	단, 배열은 [5][7] 의 형태로 만든다.
 */
public class Solv03 {
	int[][] arr = new int[5][7];
	int num;
	int sum;
	int rank;
	
	
	public void jumsu() {
			for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length-2; j++) {
				num = (int)(Math.random() * (100-1+1)+1);
				arr[i][j] = num;
				
			}
		}
	}
	
	public void setSum() {
			for(int i = 0; i < arr.length; i++) {
				int total = 0;
				for(int j = 0; j < arr[i].length-2; j++) {
					total += arr[i][j];
					
				}
				arr[i][5]=total;
				sum = total;
			}
	
	}
		// 석차 구하는 법 모름
	public void setRank() {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length; j++) {
				if( arr[i][5] > arr[j][5]) {
					int[] tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
			}
			
			rank = arr[i][6];
		}
		
	}
	
	public void setPrint() {

				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length-2; j++) {
						
						System.out.print(arr[i][j] + " " );
					}
					System.out.println();
					System.out.print("총점 : " + arr[i][5] + " 석차 : " + rank + "등");
					System.out.println();
					System.out.println("----------------------");
				}
				System.out.println(Arrays.deepToString(arr));

	}
}
