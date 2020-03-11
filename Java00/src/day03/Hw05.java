package day03;
/*
 	문제 5] 
	랜덤한 숫자 10 ~ 99 사이의 숫자를 발생시킨 후 
	그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
	
	 예]
	 	45는 50과의 차가 5가 난다.
	 	
	 	53은 50과의 차가 3이 난다.
	 	(int)(Math.random() * (최대값 - 최소값 + 1)) + (최소값);
 */
public class Hw05 {
		public Hw05() {
		solv();
	}
	public void solv() {
		// 10 ~ 99 사이의 랜덤한 숫자 만들기
		int num = (int)(Math.random() * (99 - 10 + 1)) + 10;

		// 가까운 10의 배수 만들기
		// 먼저 10으로 나눈 나머지 구하고
		int nmj = num % 10;
		
		// 나머지가 5보다 크거나 같으면 십의 단위를 10올려주고, 작으면 10의 단위로 그냥쓰고
		int sip = (nmj >= 5) ? ((num / 10 + 1) * 10) : (num / 10 * 10);
		
		// 차를 구한다. 그런데 나머지가 5보다 크거나 같은 경우는 sip에서 숫자를 빼주고,
		// 5보다 작으면 숫자에서 sip을 빼주면 된다.
		int cha = (nmj >= 5) ? (sip - num) : (num - sip);
		
		//출력하고
		System.out.println("랜덤학 발생한 숫자 : " + num + "\n가까운 십의배수 : " + sip +
							"\n가까운 십의 배수와의 차 : " + cha);
		
	}
	public static void main(String[] args) {
		new Hw05();
	}
	
	}
	

