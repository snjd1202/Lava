package day04;

public class Test02 {
/*
 	반복문
 		특정 명령을 반복하도록 하는 명령
 		
 		종류]
 			
 			1. for 명령
 				: 명령문 형식 자체에 카운터변수 (반복할 횟수를 지정하는 변수)가 만들어진다.
 			2. while 명령
 				: 형식에 카운터변수 정의하는 부분이 없다.
 				  따라서 반복문이 실행되기 전에 카운터변수가 만들어져야한다.
 				  또는 반복 실행을 종료할 조건을 반드시 추가해줘야 한다.
 				  
 				  
 	1. for 명령
 	
 		형식]
 			(1)
 			for(카운터변수 선언 & 초기화 - (2); 조건식 - (3); 증감식 - (4)){
 				실행문 - (5)
 			}
 			- (6)
 			
 			실행순서 :
 				1 -> 2 -> 3 -> 5 -> 4 -> 3 -> 5 -> 4 -> ...  
 					==> 조건식이 false 일 때까지 반복 -> (6)
 					
 			참고]
 				(2)번은 처음 딱 한 번만 실행한다.
 				(2)번은 주로 카운터변수를 초기화하는 목적으로 사용한다.
 				(2)번은 필요 없으면 생략해도 무방하나 세미콜론(;)은 남겨야 한다.
 				(2)번에서 만들어진 카운터 변수는 for명령문 내에서만 사용하는 지역변수가 된다.
 					# 지역변수 : 블럭{} 을 빠져 나가면 사라지는 변수(사용할 수 없는 변수)
 								
 				 
 				 (4)번 부분은 반복문의 내용이 실행이 끝나면 읽는 부분이다.
 				 	==> 반복횟수만큼 반복한다.
 				 	주로 카운터를 증가시키는 목적으로 사용한다.
 				 	
 			참고]
 				for 명령은 선조건 처리명령이다.
 				따라서 조건이 맞지 않는다면 한 번도 실행 하지 않을 수 있다.
 				
 			참고] 
 				for 명령문의 ( ; ; ) 안의 내용은 필요에 따라서는 생략해도 무방하다. 
 					==> 내용을 생략할 경우 조건이 항상 true로 간주된다.
 				이 경우 이 반복문은 무한반복을 하는 무한루프로 처리가 된다. 
 			
 			참고]
 				중첩 for 명령
 				
 					조건문과 마찬가지로 반복문도 중첩해서 사용할 수 있다.
 					
 					**
 					안쪽 for 명령은 바깥 for 명령이 다음 회차로 반복한다면 
 					처음부터 다시 시작한다.
 					
 					for(int i = 0; i < 10 ; i++){
 					
 						for(int j = 0; j < 5 ; j++){
 						
 						}
 					}
 			
 */
	/*
	 	예제]
	 		구구단 9단을 출력하세요.
	 		
	 */
	public static void main(String[] args) {
		//작업순서
		//계산 결과가 9번 반복되서 출력되면 된다.
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
		/*for(int i = 0; i < 9; i ++) {
			System.out.println("9 x " + (i + 1) + " = " + (9 *(i+1)));

		}*/
		
	}

}
