package test01;
/*
 	12.
			
			A B C D E
			F G H I J
			K L M N O
			P Q R S T
			U V W X Y
 */
public class Sol12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char no = 64;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				 no++;
				System.out.print(no+"\t");
			}
			System.out.println();
		}
	}

}
