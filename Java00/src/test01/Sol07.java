package test01;
/*
  7.
			1
			12
			123
			1234
			12345
 */
public class Sol07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i >= j) {
					System.out.print(j);	
				}
			}
			System.out.println();
		}
	}

}
