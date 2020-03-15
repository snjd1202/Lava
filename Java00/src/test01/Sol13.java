package test01;
/*
 	13.
			
			A
			B C
			D E F
			G H I J
			K L M N O
 */
public class Sol13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char no = 64;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i < j) {
					System.out.print(" ");
				} else { 
					no++;
					System.out.print(no);
				}
			}
			System.out.println();
		}
	}

}
