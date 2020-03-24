package day12;

import java.util.Arrays;

/*
 * 숙제
 	문제 1]
 		학생의 java, oracle, db. html, javascript, spring, sum, avg
 		점수를 관리할 배열을 만들고 
 		총점과 평균을 구해서 출력하세요.
 		
 		단, 과목별 총점과 평균도 같이 배열에서 관리하세요.(5명)
 		
 		
 */
public class Ex01 {
	double[][] score = new double[7][7];
	int jumsu;
	int sum;
	int sum1;
	int sum2;
	double avg;
			
//	public Ex01() {
//		setJumsu();
//		setSum();
//		setAvg();
//		toPrint();
//	}
//	
//	public void setJumsu() {
//		for(int i = 0; i < score.length-2; i++) {
//			for(int j = 0; j < score[i].length-2; j++) {
//				jumsu = (int)(Math.random() * (100+1-1)+1);
//				score[i][j] = jumsu;
//			}
//			
//		}
//		
//	}
//	
//	public void setSum() {
//		for(int i = 0; i < score.length; i++) {
//			int no = 0;
//			for(int j = 0; j < score[i].length; j++) {
//				no += score[i][j];
//				sum = no;
//				
//			}
//		}
//		System.out.println(sum);
//		
//	}
//	
//	public void setAvg() {
//		for(int i = 0; i < score.length; i++) {
//			for(int j = 0; j < score[i].length; j++) {
//				avg = sum/5;
//			}
//		}
//	}
//	
//	public void toPrint() {
//		System.out.println("java  db  html  javascript  spring  sum  avg");
//		for(int i =0; i<score.length; i++) {
//			System.out.println(Arrays.deepToString(score));
//			for(int j = 0; j < score[i].length; j++) {
//				
//			}
////			System.out.println(sum + " " + avg);
//			System.out.println();
//		}
////		System.out.println(Arrays.deepToString(score));
//		System.out.println();
//	}

	public static void main(String[] args) {
//		new Ex01();
		
	}

}
