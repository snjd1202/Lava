package day03;

public class Ex02 {
/*
 	문제 1]
 		게시판에 글을 한 페이지에 15개의 글을 표시할 수 있다.
 		게시물의 갯수를 랜덤하게( 0 ~ 100 ) 발생한 후 
 		필요한 페이지 수를 계산해서 출력해주는 프로그램을 작성하세요.
 		단, 게시물 수가 0인 경우는 1페이지가 필요한 것으로 한다.
 */
	
	public Ex02() {
		abc();
	}
	
	public void abc() {
		int num1 = (int)(Math.random() * 100 + 1);
		int result = 0;
		if (num1 == 0) {
			result = 1;
		} else if(num1 % 15 == 0){
			result = num1 / 15;
		} else {
			result = num1 / 15 + 1;
		} 
		System.out.println(num1);
		System.out.println("필요한 페이지 수 : " + result);
	}
	public static void main(String[] args) {
		new Ex02();

	}

}
