package day07;

import java.util.Arrays;

/*
 	���� 1]

	���ĺ� 10���� ������ �迭�� �����
	�빮�� 10���� �����ϰ� �����ؼ� �迭�� �����ϰ�
	����� �迭�� ���� ����� �����ؼ�
	����ϰ�,
	���� �迭�� �ҹ��ڷ� ������ �� 
	�� �迭�� ����ϼ���.
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
