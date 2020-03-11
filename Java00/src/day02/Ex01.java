package day02;
import java.util.*;

public class Ex01 {
/*
 	문제 1]
		 	3자리로 구성된 숫자 하나를 입력을 받은 후 또는 랜덤하게 만든 후
		 	백자리 이하를 버린 숫자를 만들어서 출력하세요.
		 		예]
		 			456 --> 400
		 			(int)(Math.random() * (최대값 - 최소값 + 1)) + (최소값);	*/
		
			
	/*문제 2]
			0 ~ 255 사이의 숫자를 랜덤하게 만들고,
			그 숫자를 코드값으로 하는 문자를 만들어서
			해당 문자가 영문자인지 아닌지 판별해서 출력하세요.
			단, 삼항 연산자를 사용해서 처리하세요.*/
			
	/*문제 3]
			화씨 온도 100도는 
			섭씨 온도 온도 몇도인지 알아보는 프로그램을 작성하세요.
			
			공식]
				섭씨온도 = 5 / 9 * (화씨온도 - 32) */
				
	/*문제 4]
			소수점이 있는 숫자를 입력한 후 
			소수점 이하 세째자리에서 반올림한 결과를 출력하세요.
			
			원리]
				+0.005 을 하면 세째자리에서 변화가 일어날 것이고,
				여기에 *100 해주면 두째짜리까지 정수부에 들어갈 것이고,
				이 것을 정수로 바꾸면 이하는 원 숫자의 세째자리 이하는 버릴 것이고,
				다시 / 100 해주면 원 소수점 형태로 변환될 것이고.. */
		
	/*문제 5] 
			랜덤한 숫자 10 ~ 99 사이의 숫자를 발생시킨 후 
			그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
			
			 예]
			 	45는 50과의 차가 5가 난다.
			 	
			 	53은 50과의 차가 3이 난다.*/
			 	
	/*문제 6]
			임의의 년도를 입력받아서 
			해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
			
			단, 삼항연산자를 사용해서 처리하세요.
			
			윤년의 정의]
				4로 나눠 떨어지고, 100으로 나눠 떨어지지 않으며,
				400으로 나눠 떨어지는 해를 윤년이라고 한다.*/
	

	// 기본 생성자 함수
	public Ex01() {
		abc();
		def();
		ghi();
		jkl();
		mno();
		pqr();
		
		
	}
	public void abc(){
		int num = (int)(Math.random() * (999 - 100 + 1)) + 100;
		System.out.println(num);
		int result = (num / 100) * 100;
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하세요. : ");
		int code = sc.nextInt();
		int result2 = (code / 100) * 100;
		System.out.println(result2);
		System.out.println("*********");
	}
	/*문제 2]
	0 ~ 255 사이의 숫자를 랜덤하게 만들고,
	그 숫자를 코드값으로 하는 문자를 만들어서
	해당 문자가 영문자인지 아닌지 판별해서 출력하세요.
	단, 삼항 연산자를 사용해서 처리하세요.*/
	public void def() {
		int code = (int)(Math.random() * (255 - 0 + 1));
		char ch = (char)code;
		System.out.println(ch);
		String result = (ch >= 'A') & (ch < 'Z')? ("영문자입니다."): ((ch >= 'a') &(ch <'z')? ("영문자입니다."):("영문자가아닙니다."));
		System.out.println(result);
		System.out.println("*********");
	}
	/*문제 3]
	화씨 온도 100도는 
	섭씨 온도 온도 몇도인지 알아보는 프로그램을 작성하세요.
	
	공식]
		섭씨온도 = 5 / 9 * (화씨온도 - 32) */
	public void ghi() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("화씨 온도를 입력하세요. : ");
		int F = sc1.nextInt();
		int result3 =  (F - 32) * 5 / 9;
		System.out.println("섭씨온도는 : " + result3);
		System.out.println("*********");
	}
	/*문제 4]
	소수점이 있는 숫자를 입력한 후 
	소수점 이하 세째자리에서 반올림한 결과를 출력하세요.
	
	원리]
		+0.005 을 하면 세째자리에서 변화가 일어날 것이고,
		여기에 *100 해주면 두째짜리까지 정수부에 들어갈 것이고,
		이 것을 정수로 바꾸면 이하는 원 숫자의 세째자리 이하는 버릴 것이고,
		다시 / 100 해주면 원 소수점 형태로 변환될 것이고.. */
	public void jkl() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("소숫점 숫자를 입력하세요. : ");
		double num = sc2.nextDouble();
		double result4 = (num + 0.005) * 100;
		int  result5 = (int)result4;
		double result6 = (double)result5/100;
		System.out.println(result6);
		System.out.println("*********");
	}
	/*문제 5] 
	랜덤한 숫자 10 ~ 99 사이의 숫자를 발생시킨 후 
	그 숫자가 가까운 10의 배수의 차를 출력하는 프로그램을 작성하세요.
	
	 예]
	 	45는 50과의 차가 5가 난다.
	 	
	 	53은 50과의 차가 3이 난다.
	 	(int)(Math.random() * (최대값 - 최소값 + 1)) + (최소값);*/
	 	public void mno() {
	 		int num = (int)(Math.random() * 99 - 10 + 1) + 10;
	 		System.out.println(num);
	 		int no1 = ((num + 5)/10 * 10);
	 		int result7 = num - no1;

	 		System.out.println(num + "은" + no1 + "과의 차가" + Math.abs(result7) + "이 난다.");
	 		System.out.println("*********");
	 	}
	 	/*문제 6]
		임의의 년도를 입력받아서 
		해당 년도가 윤년인지 평년인지 판별해서 출력해주는 프로그램을 작성하세요.
		
		단, 삼항연산자를 사용해서 처리하세요.
		
		윤년의 정의]
			4로 나눠 떨어지고, 100으로 나눠 떨어지지 않으며,
			400으로 나눠 떨어지는 해를 윤년이라고 한다.*/
	 	public void pqr() {
	 		Scanner sc3 = new Scanner(System.in);
	 		System.out.println("년도를 입력하세요. : ");
	 		int num1 = sc3.nextInt();
	 		System.out.println(num1);
	 		//String result8 = (num1 / 4 == 0) ? ("윤년입니다."):((num1 / 100 != 0)? ("윤년이 아닙니다.") :("윤년입니다."));
	 		String result8 = ((num1 % 4 == 0) && (num1 % 100 != 0) || (num1 % 400 == 0)) ? ("윤년입니다.") : ("평년입니다.");
	 		System.out.println(result8);
	 	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
