package test01;
/*
 	7-1.
				1  2  3  4  5
				6  7  8  9  10
				11 12 13 14 15
				16 17 18 19 20
				21 22 23 24 25
 */
public class Sol7_1 {

	public static void main(String[] args) {
		int no = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 1; j <= 5; j++) {
				no++;
					System.out.printf("%3d", + no);
			}
			
			System.out.println();
		}
	}

}
