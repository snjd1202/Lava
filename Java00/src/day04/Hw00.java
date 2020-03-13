package day04;

/*
 	반복문을 사용해서 다음  모양을 출력하세요.
 	
 		1.
 			*
 			**
 			***
 			****
 			*****
 			
 		2.
	 			 *
	 			**
	 		   ***
	 		  ****
	 		 *****
 		 
 		3.
 			*****
 			****
 			***
 			**
 			*
 			
 		4. 
 		   *****
 		    ****
 		     ***
 		      **
 		       *
 		       
 		5. 
 				*
 			   ***
 			  *****
 			 *******
 			*********
 			
 		6. 
 				*
 			   ***
 			  *****
 			 *******
 			*********
 			 *******
 			  *****
 			   ***
 			    *
 			 
 		7-0.
 			12345
 			12345
 			12345
 			12345
 			
 		7-1.
 			1  2  3  4  5
 			6  7  8  9  10
 			11 12 13 14 15
 			16 17 18 19 20
 			21 22 23 24 25
 			
 			    
 		7.
 			1
 			12
 			123
 			1234
 			12345
 			
 		8.
 				1
 			   12
 			  123
 			 1234
 			12345
 			
 		9. 
 			12345
 			1234
 			123
 			12
 			1
 			    
 		10.
 			1
 			2  3
 			4  5  6
 			7  8  9  10
 			11 12 13 14 15
 			
 		00.
 			1  1  1  1  2
 			2  2  2  3  3
 			3  3  4  4  4
 			4  5  5  5  5
 			6  6  6  6  6
 		
 		
 */
public class Hw00 {
	public static void main(String[] args) {
//	1-0 번
//		for(int i = 1;i <= 5; i++) {
//				String msg = "*****";
//			System.out.println(msg);
//		}

//	1번
//		String msg = "*";
//		lb:
//	for(int i = 1; i <= 5; i++) {
//		for(int j = 1; j < i; j++) {
//				msg = (msg + "*");
//				System.out.println(msg);
//			continue lb;
//				}
//		System.out.println(msg);
//			}
//	1번
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
////	2번
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 5; j > 0; j--) {
//					if(i >= j) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//						
//					}
//			}
//			System.out.println();
//		}
			

		
//	3번
//		for(int i = 5; i >= 1; i--) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//			
//		}
	

		
//	4번
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				if(i <= j) {
//					System.out.print("*");
//				} else{
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//	5번
//		for(int i = 0; i < 5 ; i++) {
//			for(int j = 0; j < i+5; j++) {
//				String str = " ";
//				if(j >= 4-i) {
//					str = "*";
//					System.out.print(str);
//					
//				} else {
//					System.out.print(str);
//				}
//			}
//			System.out.println();
//		}
		
// 7-0
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				int no1 = j;
//				System.out.print(no1);
//			}
//			System.out.println();
//		}
		
//	7-1
//		for(int i = 0; i <5; i++) {
//			for(int j = 1; j <= 5; j++) {
//				int no1 = 5*i+j;
//				System.out.printf("%3d", +no1);
//						
//			}
//
//
//			System.out.println();
//		}
		
//	7번
//		for(int i =1; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//	8번
//		for(int i= 0; i < 5; i++) {
//			int no = 0;
//			String str = " ";
//			for(int j = 0; j < 5; j++) {
//				if(4 - i <= j) {
//					str = ++no + "";
//				}
//				System.out.printf("%3s", str);
//			}
//			System.out.println();
//		}

//		for(int i= 5; i > 0; i--) {
//			for(int j = 1; j <= 5 ; j--) {
//				if(i >= j) {
//					System.out.print(" ");
//				} else {
//					System.out.print(j);
//				}
//			}
//			System.out.println();
//		}
//
//        for (int i = 1; i <= 5; i++) {
//           for (int k = 5; k > i; k--) {
//              System.out.print(" ");
//           	}
//           	for (int j = 1; j <= i; j++) {
//           		System.out.print(j);
//           }
//
//           System.out.println();
//        }
	
//	9번
//		for(int i= 1; i <= 5; i++) {
//			for(int j = 5; j > 0; j--) {
//				if(i <=j) {
//					System.out.print(j);
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//        for(int i = 0; i < 5; i++) {
//        	for(int j = 0; j < 5; j++) {
//        		if(i <= j) {
//        		System.out.print(j - i + 1);
//        	} 
//        	}
//        	System.out.println();
//        }
        
//        for(int i = 5; i>=1;i--) {
//        	for(int j=1;j<=i;j++) {
//        		System.out.print(j);
//        	}
//        	System.out.println();
//        }
		
		/*
		for(int i = 1; i <= 5; i++) {
			for(int j=1; j <= 5;j++) {
				if(i>=j) {
					System.out.printf("%3d", i + j -1);
				}
			}
			System.out.println();
		}
		*/
//		int num = 1;
//		for(int i = 0 ; i < 5 ; i++ ) {
//			for(int j = 0 ; j <= i ; j++) {
//				System.out.printf("%3s", (num++) + "");
//			}
//			System.out.println();
//		}
		
//		//00 - 1 
//		int num = 1;
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; i++) {
//			if(i <= j-1) {
//				System.out.print(num);
//			} 
//			
//			}
//			System.out.println();
		
		for (int i = 1; i <= 5; i++) {
          for (int k = 5; k > i; k--) {
             System.out.print(i);
          	}
          	for (int j = 1; j <= i; j++) {
          		System.out.print(i+1);
          }

          System.out.println();
       }
		
//		00
//		for(int i =1; i <= 5;i++) {
//			for(int j = 1; j <= 5; j++) {
//				if(i<=5) {
//					System.out.print("\t" + i);
//				}
//			}
//			System.out.println();
//		}
//	
		for(int i = 2; i <=9;i++) {
			for(int j=1;j<=9;j++) {
				int result= i * j;
				System.out.print( i +" x " + j + " = " + result +"\t ");
			}
		}
	}
}
	
