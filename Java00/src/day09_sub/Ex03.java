package day09_sub;

/*
 	¹®Á¦ 3]
 	
 		1 2 99 4 5 
 		2 99 4 5 99
 		99 4 5 99 7
 */
public class Ex03 {

	public static void main(String[] args) {
		int no = 0;
		for(int i = 0; i < 3 ; i++) {
			for(int j = 0; j < 5; j++) {
				no = (i+(j+1));
				if((i+(j+1)) % 3 == 0) {
					no = 99;
				}
				System.out.printf("%3d",no);
			}
			System.out.println();
		}
			
	}

}
