package day11;

/*
 	���� 3]
 		���� 1, 2������ ���� Ŭ������ ��ü�� ���� 
 		�� ������ �Լ��� �ùٸ��� �۵��ϴ��� �����ϼ���.
 */
public class Ex01 {
	public Ex01() {
		// �� 10���� ���� ��������.
		Circle[] won = new Circle[10];
		for(int i = 0; i < won.length; i++) {
			if(i < 5) {
				won[i] = new Circle((int)(Math.random() * 16+5));
			} else {
				won[i] = new Circle();
			}
		}
			
		// �� ����ϱ�
		for(int i = 0; i < won.length; i++) {
			won[i].toPrint();
		}
		
		
		// ���� Ŭ���� �����
		Score[] score = new Score[3];
		score[0] = new Score();
		score[1] = new Score("������");
		score[2] = new Score("�ؼ�", 100, 100, 100, 100, 95, 85);
		
		//����ϱ�
		for(int i = 0; i < score.length; i++) {
			score[i].toPrint();
		}
		

		
//		Circle c = new Circle();
//		Score s = new Score();
		
//		c.toPrint();
//		s.toPrint();
		
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	
	
}
