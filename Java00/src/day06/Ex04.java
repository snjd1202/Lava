package day06;

/*
 	���� 4]
	������ 5���� ����� �迭�� �����, 
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� �����,
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ���� 
	
	����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	��, ������´� 
	
		��]
			������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
			
	�� ���·� ��µǰ� �ϼ���.
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
			
			System.out.println("������ : " + arr[i] + " ���� �ѷ� : " + arr2[i] + " ���� ���� : " + arr3[i]);
		}
		

	}

}
