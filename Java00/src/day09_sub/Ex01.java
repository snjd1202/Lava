package day09_sub;
/*
 	문제 1]
 	
 		반복문을 사용해서 출력하세요.
 		
 		2 3 4 5 6
 		3 4 5 6 7
 		4 5 6 7 8 
 		5 6 7 8 9
 		6 7 8 9 10
 */
public class Ex01 {

	public static void main(String[] args) {
		int cnt = 0;
		for(int i = 2; i <= 6; i++) {
			for(int j = 0; j < 5; j++) {
				
				System.out.printf("%3d",j+i);
			}
			System.out.println();
		}
		
	}

}
