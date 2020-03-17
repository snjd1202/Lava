package day06;

import java.util.Arrays;

/*
 	문제 5]
	피보나치 수열 10개를 저장할 배열을 만들고
	배열에 값을 입력해서
	배열에 저장된 데이터출력하세요.
 */
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		int no = 1;
		int no1 = 1;
		
		for(int i = 0; i < 10; i++) {
			arr[i] = no + no1;
			no = no1;
			no1 = arr[i];			
		
			
			System.out.print(arr[i] + ", ");
//			System.out.println(Arrays.toString(arr));

				
		}
	}

}
