package day07;

/*
 	���� 2]
	���� 10���� ������ �迭�� �����
	�����ϰ� 1 ~ 50���� �� �� �߻����Ѽ�
	�迭�� ���
	�迭�� 5��°������ �����͸� ���� ����� �����ϼ���.
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
