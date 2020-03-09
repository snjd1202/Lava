package day01;

public class Ex01 {
	/*
	 	1. 5, 10, 20을 제외한 숫자 하나를 가정하고(양수, 음수 모두)
		 	이 것을 2진수로 바꿔보고 
		 	실제 프로그램의 결과와 일치하는지 확인하세요.
		 	
		 	비트코드 확인 방법
		 		Integer.toBinaryString(숫자);
------------------------------------------------------------------------------

		 2. 반지름이 7인 원의 넓이, 둘레를 계산해서 출력하세요.
		 		원의 둘레는 2 * 반지름 * 3.14
		 		원의 넓이는 반지름 * 반지름 * 3.14
		 		
		 		단, 반지름, 둘레, 넓이는 변수를 만들어서 처리하세요.
		 		그리고 둘레는 float 타입의 변수로 만드세요.
		 		
		 3. 두 개의 숫자(정수)를 변수에 담고
		  		두 수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
		  		
		  4. 3번 문제의 두 수를 밑변과 높이로 가지는 삼각형의 넓이를 구하세요.
		  
		  5. 54232원을 지불을 해야한다.
		 		우리나라의 화폐로 각 단위가 몇개나 필요한지 계산해서 출력하세요.
		 		5만원권 - 1장
		 		1만원권 - 0장
		 		5천원권 - 0장
		 		1천원권 - 4장
		 		...
		 		
		 숙제]
		 		1년은 365.2426일이다.
		 		이 날짜는 과연 몇 일, 몇 시간, 몇 분, 몇 초인지 계산해서 출력하세요. 
	 */
	public static void main(String[] args) {
		System.out.println("37 : " + Integer.toBinaryString(37));
		System.out.println("******************");
		// 17 = 10001
		// 37 = 100101
		
		// 2		
		int a = 7;
		double dool = (float)(2 * a * 3.14);
		double nulbi = (a * a * 3.14);
		
		System.out.println("반지름이 " + a + "인 원의 둘레 : " + dool );
		System.out.println("반지름이 "+ a + "인 원의 넓이 : " + nulbi);
		System.out.println("******************");
		
		// 3
		int width = 5;
		int hight = 7;
		System.out.println("사각형의 넓이는 : " + width * hight);
		System.out.println("******************");
		
		// 4
		System.out.println("삼각형의 넓이는 : " + (width * hight) / 2);
		System.out.println("******************");
		
		// 5
		int no1 = 54232;
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obak = 0;
		int bak = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		
		int temp = no1;
		oman = temp/50000;
		temp %= 50000;
		man = temp/10000;
		temp %= 10000;
		ochun = temp/5000;
		temp %= 5000;
		chun = temp/1000;
		temp %= 1000;
		obak = temp/500;
		temp %= 500;
		bak = temp/100;
		temp %= 100;
		osip = temp/50;
		temp %= 50;
		sip = temp/10;
		temp %= 10;
		il = temp/1;
		temp %= 1;
		
		System.out.println("5만원권 : " + oman + "장");
		System.out.println("1만원권 : " + man + "장");
		System.out.println("5천원권 : " + ochun + "장");
		System.out.println("1천원권 : " + chun + "장");
		System.out.println("5백원 : " + obak + "개");
		System.out.println("1백원 : " + bak + "개");
		System.out.println("5십원 : " + osip + "개");
		System.out.println("1십원 : " + sip + "개");
		System.out.println("1원 : " + il + "개");
		System.out.println("******************");
		
		
		/*	숙제]
		 		1년은 365.2426일이다.
		 		이 날짜는 과연 몇 일, 몇 시간, 몇 분, 몇 초인지 계산해서 출력하세요.*/
		double time = 365.2426;
		int sec = (int)((time % 1) * 24 * 60 * 60);
		
		int dd = (int)time;
		int hh = sec / 3600;
		sec %= 3600;
		int mm = sec / 60;
		sec %= 60;
		int ss = sec;
		
		System.out.println(dd + "일");
		System.out.println(hh + "시간");
		System.out.println(mm + "분");
		System.out.println(ss + "초");
		
	}
}
