package day04;

import java.util.*;
public class Ex04 {
/*
 	문제 4]
 		다섯자리 정수를 입력받아서 
 		그 숫자가 회문수인지 아닌지 판별해서 출력하세요.
 		
 		회문수란?
 			앞에서 읽으나 뒤에서 읽으나 똑같은 수를 회문수라 한다.
 			예]
 				12321 - 회문수
 				12312 - 회문수 아님
 				
 		참고]
 			문자열.charAt(위치값) - 문자열의 특정 위치의 문자를 반환해주는 함수
 			"acb".charAt(2)
 			문지열.toCharArray()  - 문자열은 문자배열로 반환해주는 함수
 			"abc".toCharArray()[2]
 			
 		반복문 제어명령]
 			1. break		- 반복문 또는 switch 문을 종료시키는 명령
 			
 			2. continue		- 반복문을 다시 진행시키는 명령
 			
 				for(1; 2; 3){
 					4
 					continue;
 					5
 				}
 				순서 : 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> ...
 				
 				while(1) {
 					2
 					continue;
 					3
 				}
 				순서 : 1 -> 2 -> 1 -> 2 -> 1 -> ...
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 정수를 입력하세요. : ");
		String msg = "회문수";
		String str = sc.nextLine();
		for(int i = 0; i < str.length() / 2; i++) {
			// 문자열 중 문자를 첫 문자부터 꺼내서 뒤에서부터 문자와 비교한다.
			if(str.charAt(i) == str.charAt((str.length() - 1) - i)) {
				// 이 경우는 두 문자가 같은경우 이므로 다음 문자를 꺼내서 비교해야한다.
				continue;
			}
			// 이 경우는 두 문자가 다른 경우 이므로 회문수가 아니게된다.
			msg = "회문수가 아닌 수";
			break;
		}
		System.out.println(msg);
	}

}
