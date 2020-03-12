package day04;
/*
 	문제 3]
 		2x + 4y = 10 의 방정식 결과를 출력하세요.
 		단, x,y 는 모두 0 이상 10 이하의 정수이다.
 */
public class Ex03 {

	public static void main(String[] args) {
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				int sum = (2 * x) + (4 * y);
				if(sum == 10) {
					System.out.println("x값 : " + x + " y값 : " + y + " 결과 : " + sum);
				}
			}
		}

	}

}
