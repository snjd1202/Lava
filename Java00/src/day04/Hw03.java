package day04;

/*
 	(��ø�� �ݺ������� ó��)
 	2 ~ 100 ������ �� �� �Ҽ��� ������ִ� ���α׷��� �ۼ��ϼ���.
 	
 	�Ҽ� : 1�� �ڱ� �ڽ����θ� ���� �� �ִ� ��
 */
public class Hw03 {

	public static void main(String[] args) {
		for(int i = 2; i <=100; i++) {
			if(i % 1== 0 && i % i == 0) {
				
				 System.out.println(i);
			}
		}

	}

}
