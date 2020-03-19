package day09_sub;
/*
 	1 2 3 4 10
 	3 4 5 6 18
 	5 6 7 8 26
 	
 */
public class Ex04 {

	public static void main(String[] args) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 4) {
				}
				int no = (i+j+1)+i;
				if(j == 4) {
					no = 8*(i+1)+2;
				}
				System.out.printf("%3d",no);
			}
			System.out.println();
		}
	}

}
