package day02;


import java.util.*;
public class Test01 {
/*
 	자바 프로그램의 토큰 구분
 		
 		==> 컴파일러는 토큰 단위로 번역을 시도한다.
 			따라서 개발자는 컴파일러가번역을 하는 토큰을 구분해 주어야 한다.
 			이때 사용하는 기호가 ";" 기호를 사용해서 구분을 한다.
 			
 		우리가 습관적으로 int a = 20;
 		한 이유는 토큰을 구분해주기 위한 기호이다.
 		
 		결론적으로 토큰이란 하나의 명령이 종료되었음을 알려주는 기호이다.
 		
 		만약 개발자가 토큰 구분을 하지 않으면 오류가 날 수 있다.
 		
 		예]
 			int a = 10
 			int b = 20;
 				==> 위의 두 줄을 컴파일러는 하나의 명령으로 간주해서 처리할 것이고,
 				 	이런 명령의 형식은 자바에서는 존재하지 않으므로 에러가 발생하게 된다.
 				 	
 		예]
 			int a = 10; int b = 20;
 				==> 한줄로 입력했지만
 					두 개의 명령을 토큰으로 구분해줬기 때문에 각각을 인식해서 컴파일 할 수 있다.
 					
 		참고]
 			; 대신 } 기호가 그 역할을 대신할 수 있다.
 			
 			예]
 				if(조건식) {
 				
 				}	// 이 부분에서 토큰이 발생하게 된다.
----------------------------------------------------------------------------------------------------------- 	
 	키보드로 데이터를 입력받아서 사용하는 방법
 		1. 클래스 구문 시작 전에 
 		 	import java.util.*;
 		 	로 java.util 패키지의 모든 클래스를 사용할 준비를 해둔다.
 		 	import java.util.Scanner;
 		 	==> 이 방법은 java.util 패키지 내의 Scanner 클래스만 사용할 준비를 한 것.
 		
 		2. 프로그램에 들어가서
 		
 			Scanner sc = new Scanner(System.in);
 			
 			이라는 명령을 이용해서 키보드를 통해서 입력받을 도구를 준비한다.
 			
 		3. 키보드를 통해서 입력받을 필요가 생겼을 때 
 				
 			변수 = sc.nextXXX();
 			명령을 이용해서 데이터를 입력받으면 된다.
 			
 			이 때 XXX는 입력받을 데이터의 종류에 따라 달라진다.
 			
 			문자열	- sc.nextLine();
 			정수 	- sc.nextInt();
 			실수	- sc.nextFloat();
 			
 		참고]
 			정수형태의 문자열을 정수로 변환시키는 방법
 			Integer.parseInt(숫자형문자열); 
 */
	public static void main(String[] args) {
		// 숫자를 입력받아서 입력받은 수에서 50을 뺀 수를 출력하자.
		
		// 1. 입력받을 준비한다.
		Scanner sc = new Scanner(System.in);
		// 2. 메세지 출력한다.
		System.out.print("정수를 입력하세요. : ");
		// 3. 입력받은 데이터를 문자열변수에 담는다.
		String str = sc.nextLine();
		// 입력받은 수 필요없으면 닫아준다.
//		sc.close();
		// 4. 문자열 데이터를 정수로 변환한다.
		int num = Integer.parseInt(str);
		// 5. 변환된 정수를 계산한다. 
		int result = num - 50;
		// 6. 계산 결과를 출력한다.
		System.out.println("입력한 수 " + num + "에서 50을 빼면 " + result + " 입니다.");
		System.out.println("**********");
		

		/* 2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
		 		원의 둘레는 2 * 반지름 * 3.14
		 		원의 넓이는 반지름 * 반지름 * 3.14
		 		
		 		단, 반지름, 둘레, 넓이는 변수를 만들어서 처리하세요.
		 		그리고 둘레는 float 타입의 변수로 만드세요.*/
		 		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("반지름의 길이를 입력하세요. : ");
		String num1 = sc1.nextLine();
		int ban = Integer.parseInt(num1);
		double dool = (ban * 2 * 3.14);
		double nulbi = (ban * ban) * 3.14;
		System.out.println("입력한 반지름의 길이가 " + ban + "인 원의 둘레는" + dool + "입니다.");
		System.out.println("입력한 반지름의 길이가 " + ban + "인 원의 넓이는" + nulbi + "입니다.");
		System.out.println("**********");
		
		/* 3. 두 개의 숫자(정수)를 변수에 담고
		  		두 수를 가로, 세로로 하는 사각형의 넓이를 구하세요.*/
		Scanner sc2 = new Scanner(System.in);
		System.out.print("가로의 길이를 입력하세요. : ");
		String garo = sc2.nextLine();
		Scanner sc3 = new Scanner(System.in);
		System.out.print("세로의 길이를 입력하세요. : ");
		String sero = sc3.nextLine();
		sc3.close();
		int width = Integer.parseInt(garo);
		int hight = Integer.parseInt(sero);
		int sagak = width * hight;
		int samgak = (width * hight) / 2;
		System.out.println("입력한 가로의 길이가 " + width + "이고, 세로의 길이가 " + 
		hight + "인 사각형의 넓이는 " + sagak + "입니다.");
		System.out.println("위와 같은 가로,세로 길이의 삼각형의 넓이는 " + samgak + "입니다.");
		
		
		
		
		
		 /* 4. 3번 문제의 두 수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요.*/
		
		
	}

}
