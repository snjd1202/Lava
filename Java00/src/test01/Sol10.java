package test01;
/*
 	10.
			1
			2  3
			4  5  6
			7  8  9  10
			11 12 13 14 15
 */
public class Sol10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i >= j) {
					no++;
					System.out.printf("%3d", + no);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
