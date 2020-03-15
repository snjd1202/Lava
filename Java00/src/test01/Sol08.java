package test01;
/*
 	8.
			    1
			   12
			  123
			 1234
			12345
 */
public class Sol08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =1; i <= 5; i++) {
			for(int j = 5; j >= 1; j--) {
				if(i >= j) {
					System.out.print((j));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
