package day09_sub;

/*
 	¹®Á¦ 2]
 	
 		2 4 6 8 10
 		3 5 7 9 11 
 		4 6 8 10 12
 		
 */
public class Ex02 {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				
				System.out.printf("%3d",(i+j+2) + (j));
			}
			System.out.println();
		}
	}

}
