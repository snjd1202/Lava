package test01;
/*
 	00 - 01. ==> 반복문 중첩해서...
		
			1  1  1  1  2
			2  2  2  3  3
			3  3  4  4  4
			4  5  5  5  5
			6  6  6  6  6
 */
public class Sol10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i <= j-1) {
					System.out.print(i);
				} else {
					System.out.print(i+1);
				}
			}
			System.out.println();
		}
	}

}
