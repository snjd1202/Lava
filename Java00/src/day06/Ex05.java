package day06;

import java.util.Arrays;

/*
 	���� 5]
	�Ǻ���ġ ���� 10���� ������ �迭�� �����
	�迭�� ���� �Է��ؼ�
	�迭�� ����� ����������ϼ���.
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
