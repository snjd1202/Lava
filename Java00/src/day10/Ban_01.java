package day10;

/*
	 ���� 1]
	
	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����,
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ���� 
	�� ����� �ʱ�ȭ�ϰ� 
	����ϼ���.

*/
public class Ban_01 {
	Ban[] ban1;
	
	public void setBan() {
		ban1 = new Ban[10];
		
		for(int i = 0; i < ban1.length; i++) {
			ban1[i] = new Ban();
			
			int no = (int)(Math.random()*(33 - 29 + 1)+29);
			ban1[i].setVal(no);
		}
	}
	
	public static void main(String[] args) {
		Ban_01 b = new Ban_01();
		
		b.setBan();
		
		for(int i = 0; i < b.ban1.length; i++) {
			b.ban1[i].toPrint();
		}
		System.out.println();
	}

}
