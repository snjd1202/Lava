package day09;

/*
 	문제 1]
	반지름을 랜덤하게 발생해서	- 함수로.. 
	그 반지름을 입력하면 
	원의 넓이를 구해주는 함수와
	원의 둘레를 구해주는 함수를 제작하고
	실행해서 출력하세요.
 */
public class Solv01 {
	int no;
	double nul;
	double dool;
	
	public void ban() {
		no = (int)(Math.random() * (50-1+1) + 1);
		
		System.out.println(no);
	}
	
	public void nulbi() {
		nul = no * no * 3.14;
		
		System.out.println(nul);
	}
	
	public void doole() {
		dool = no * 2 * 3.14;
		
		System.out.println(dool);
	}
	
	
	
}
