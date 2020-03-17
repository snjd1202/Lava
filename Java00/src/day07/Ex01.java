package day07;

import java.util.Arrays;

/*
 	문제 1]

	알파벳 10개를 저장할 배열을 만들고
	대문자 10개를 랜덤하게 추출해서 배열에 저장하고
	저장된 배열을 얕은 복사로 복사해서
	출력하고,
	원래 배열을 소문자로 변경한 후 
	두 배열을 출력하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		char[] arr = new char[10];
		char[] arr1;

		for(int i = 0; i < 10; i++) {
			char str = (char)(Math.random() * ('Z'-'A'+ 1) + 'A');
			arr[i] = str;
			
		}
		arr1 = arr;
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			arr1[i] = (char)(arr[i] + ('a'-'A')); 
		}
		
		System.out.println(Arrays.toString(arr1));		
		

	}

}
