package day03;

public class Ex02 {
/*
 	���� 1]
 		�Խ��ǿ� ���� �� �������� 15���� ���� ǥ���� �� �ִ�.
 		�Խù��� ������ �����ϰ�( 0 ~ 100 ) �߻��� �� 
 		�ʿ��� ������ ���� ����ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
 		��, �Խù� ���� 0�� ���� 1�������� �ʿ��� ������ �Ѵ�.
 */
	
	public Ex02() {
		abc();
	}
	
	public void abc() {
		int num1 = (int)(Math.random() * 100 + 1);
		int result = 0;
		if (num1 == 0) {
			result = 1;
		} else if(num1 % 15 == 0){
			result = num1 / 15;
		} else {
			result = num1 / 15 + 1;
		} 
		System.out.println(num1);
		System.out.println("�ʿ��� ������ �� : " + result);
	}
	public static void main(String[] args) {
		new Ex02();

	}

}
