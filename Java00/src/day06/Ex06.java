package day06;

/*
 	���� 6]
	���丮�� 10���� ������ �迭�� �����,
	1���� ���������� 10������ ���丮���� ���� �迭�� ���
	������ ����ϼ���.
 */
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = new long[10];
		long no = 1;
		
		for(int i = 0; i < 10; i++) {
			long result = no * (i+1);
			no = result;
			
			arr[i] = result;
			System.out.println(arr[i]);
		}
	}
}
