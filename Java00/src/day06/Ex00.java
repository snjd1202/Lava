package day06;

/*
 	���� 00]
 		1, 2,...�� �����ϴ� ���丮���� 10���� ���ؼ� ����ϼ���.
 		
 		 ���丮�� : 
 		 	1���� �ڱ��ڽű��� ���� ���� ���� ������ �ϴ� ��
 		 	
 		 	1! = 1
 		 	2! = 1 * 2
 		 	3! = 1 * 2 * 3
 */
public class Ex00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*long no1 = 1;
			long no2 = 2;
			for(int i = 0; i < 8; i++) {
				long result = 1 * no1 * no2;
				no1 = no2;
				no2 = result;
				System.out.print(result + ", ");
			}*/
		// �� ���ڸ� �ݺ��ؼ� ������ִ� �ݺ���
		for(int i = 1; i <= 10; i++) {
			int result = 1;
			// ������� ���ڱ��� ���� ����� ������ִ� �ݺ���
			for(int j = 1; j <= i; j++) {
				result = result * j;
			}
			System.out.print(result + ", ");
		}
				}

}
