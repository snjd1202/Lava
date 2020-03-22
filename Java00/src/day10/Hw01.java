package day10;

/*
 * 숙제 1]

	학생의 이름, 국어, 영어, 수학, 물리, 코딩 정수를 관리하는 클래스를 제작하고,
	학생의 데이터를 준비된 만큼만 입력해서 
	전체 총점, 전체 평균을 구하는 프로그램을 작성하세요. ( 가변인수 사용 )
 */
import java.util.*;
public class Hw01 {
	String name[] = {"김수진","이한철","이진수","김성현","손은진"};
//	String[] sub = {"국어","영어","수학","물리","코딩"};
	int[][] sub = new int[5][5];
	int sum;
	
	
	
	
	public void jumsu() {
		for(int i = 0; i < sub.length; i++) {
			for(int j = 0; j < sub[i].length; j++) {
				
				int no = (int)(Math.random() * (100 - 1 + 1) + 1);
				sub[i][j] = no;
			}
//			System.out.println(sub[i]);
		}
	}
	
	public void setSum() {
		int num = 0;
		for(int i = 0; i < sub.length; i++) {
			for(int j = 0; j < sub[i].length; j++) {
				num += sub[i][j];
			}
		}
		sum = num;
	}

	public double setAvg() {
		return sum/5.;
	}
	
	public void toPrint() {
		for(int i = 0; i < sub.length; i++) {
			System.out.println("이름 : " + name[i]);
			for(int j = 0; j < sub[i].length; j++) {
				System.out.print(sub[i][j] + " ");
			}
			System.out.println();
			System.out.println("--------------");
			
		}
		System.out.println("전체 총점 : " + sum);
		System.out.println("전체 평균 : " + setAvg());
		System.out.println();
	}
	
}
