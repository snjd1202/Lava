package test01;
/*
 	11.
			2 x 1 = 2 	3 x 1 = 3 	...		9 x 1 = 9
			...
			2 x 9 = 18	3 x 9 = 27	...		9 x 9 = 81
 */
public class Sol11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
					System.out.print(j + " x " + i + " = " + (j*i) +  "    ");
			}
			System.out.println();
		}
	}

}
