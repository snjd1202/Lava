package day06;

/*
 	문제 4]
	반지름 5개를 기억할 배열을 만들고, 
	각가의 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고,
	각 원의 둘레를 계산해서 저장할 배열도 만들어서 
	
	결과를 출력하는 프로그램을 작성하세요.
	단, 출력형태는 
	
		예]
			반지름 : 10, 원의 둘레 : 62.8, 원의 넓이 : 314
			
	의 형태로 출력되게 하세요.
 */
public class Ex04 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		double arr2[] = new double[5];
		double arr3[] = new double[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = (int)(Math.random()*(5-1+1)+1);
			arr2[i] = arr[i] * arr[i] * 3.14;
			arr3[i] = arr[i] * 2 * 3.14;
			
			System.out.println("반지름 : " + arr[i] + " 원의 둘레 : " + arr2[i] + " 원의 넓이 : " + arr3[i]);
		}
		

	}

}
