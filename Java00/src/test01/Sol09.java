package test01;
/*
 	9.
			12345
			1234
			123
			12
			1
 */
public class Sol09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= 1; j--) {
				if(i > j) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
