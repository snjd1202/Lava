package day08;

import java.util.Arrays;

/*
	 ���� 2]
		����, ����, ����, ����, ���� ������ �����Ϸ��� �Ѵ�. (������ �����ϰ� �����ϼ���.)
		�л��� ���� 5���̰� , 
		2���� �迭�� ���� 
		5���� ������ ������ �迭�� ���弼��.
 */
public class Ex02 {

	public static void main(String[] args) {
//		String[] name = {"�����", "������", "����ö", "������", "�輺��"};
//		String[] sub = {"����", "����", "����", "����", "����"};
		
		
		int [][] arr = new int[5][6];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 6; j++) {
				arr[i][0] = 1000 + i;
				int score = (int)(Math.random() * 100 -1 + 1 )+1; 
				arr[i][j] = score;
			}
			
//			int stu = arr[i][0];
//			System.out.println(stu + score);
			
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("-------------------------");
			for(int j = 0; j < arr[i].length; j++) {
		System.out.printf("%3d|", arr[i][j]);
				
			}
			System.out.println();
//			System.out.println(Arrays.toString(arr));
		}
		
		
	}
	

}
