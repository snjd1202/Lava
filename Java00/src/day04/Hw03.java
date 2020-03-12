package day04;

/*
 	(중첩된 반복문으로 처리)
 	2 ~ 100 사이의 수 중 소수만 출력해주는 프로그램을 작성하세요.
 	
 	소수 : 1과 자기 자신으로만 나눌 수 있는 수
 */
public class Hw03 {

	public static void main(String[] args) {
		for(int i = 2; i <=100; i++) {
			if(i % 1== 0 && i % i == 0) {
				
				 System.out.println(i);
			}
		}

	}

}
