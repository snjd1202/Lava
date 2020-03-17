package day07;

/*
 	문제 2]
	정수 10개를 저장할 배열을 만들고
	랜덤하게 1 ~ 50까지 수 중 발생시켜서
	배열에 담고
	배열의 5번째까지의 데이터를 깊은 복사로 복사하세요.
 */
import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		for(int i = 0; i < 10; i++) {
			int no = (int)(Math.random()*(50-1+1)+1);
			arr[i] = no;
		}
		System.arraycopy(arr, 0, arr1, 0, 5);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	}

}
