package day07;

import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		
		int[] num2 = num1;	// ���� ����

//		float[] no = num1;	// Heap Type�� �ٸ��� ������ �Ұ����ϴ�.
		
		num1[2] = 30;
		
		System.out.println("num1 : " + Arrays.toString(num1));
		System.out.println("num2 : " + Arrays.toString(num2));
	}

}
