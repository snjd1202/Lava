package day11;

/*
 	���� 1]
 		�� Ŭ������ ���� ������ ������ Ŭ�����̴�.
 		�� Ŭ������ ��ü�� �� �� �������� �Է¹޾Ƽ� 
 		���� ���� ������ �Է��� �ǰ�
 		Ŭ������ �����ϼ���.
 		
 		�������� �Է��� �ȵ� ���� 10���� �Էµǰ� �ϼ���.
 */

public class Circle {
	// �� Ŭ������ ���� ���� ������ ����ϴ� Ŭ�����̹Ƿ�
	// ������, �ѷ�, ���̸� ����ϸ� �� ���̴�.
	int ban;
	double dool,nul;
	
	// �⺻������ �Լ�
	public Circle() {
		this(10);
	}
//	public Circle(int ban,) 
	
	// ������ �Լ� �����ε�
	public Circle(int ban) {
		this.ban = ban;
		this.dool = getDool(ban);
		this.nul = getNul(ban);
	}
	
	// ���� �ѷ��� �����ִ� �Լ�
	public double getDool(int ban) {
		return ban * 2 * 3.14;
	}
	
	// ���� ���� �����ִ� �Լ�
	public double getNul(int ban) {
		return ban * ban * 3.14;
	}
	
	public void toPrint() {
		System.out.printf("������ : %5d | ���ǵѷ� : %7.2f | ���ǳ��� : %7.2f", ban, dool, nul);
		System.out.println();
	}
	
}
