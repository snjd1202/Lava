package day09;

import java.util.Arrays;

/*
 	���� 3]
	�ټ� �л��� ����, ����, ����, ����, ���� ������ �Է¹޾Ƽ� 
	������ ������ ���ϴ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, �������, ����� �Լ��� ó���ϼ���.
	
	��, �迭�� [5][7] �� ���·� �����.
 */
public class Solv03 {
	int[][] arr = new int[5][7];
	int num;
	int sum;
	int rank;
	
	
	public void jumsu() {
			for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length-2; j++) {
				num = (int)(Math.random() * (100-1+1)+1);
				arr[i][j] = num;
				
			}
		}
	}
	
	public void setSum() {
			for(int i = 0; i < arr.length; i++) {
				int total = 0;
				for(int j = 0; j < arr[i].length-2; j++) {
					total += arr[i][j];
					
				}
				arr[i][5]=total;
				sum = total;
			}
	
	}
		// ���� ���ϴ� �� ��
	public void setRank() {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length; j++) {
				if( arr[i][5] > arr[j][5]) {
					int[] tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
				
			}
			
			rank = arr[i][6];
		}
		
	}
	
	public void setPrint() {

				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length-2; j++) {
						
						System.out.print(arr[i][j] + " " );
					}
					System.out.println();
					System.out.print("���� : " + arr[i][5] + " ���� : " + rank + "��");
					System.out.println();
					System.out.println("----------------------");
				}
				System.out.println(Arrays.deepToString(arr));

	}
}
