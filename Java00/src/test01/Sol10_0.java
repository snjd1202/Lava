package test01;
/*
 	00. ==> 반복문 중첩해서...
			1  1  1  1  1
			2  2  2  2  2
			3  3  3  3  3
			4  4  4  4  4
			5  5  5  5  5
 */
public class Sol10_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d", + i);
			}
			System.out.println();
		}
	}

}
