package day11;

public class Dongl extends Dohyung{

	int ban;
	double dool;

	public Dongl() {
		this(1);
	}
	
	public Dongl(int ban) {
		this.ban = ban;
		setDool();
		setArea();
//		toPrint();
		
	}
		
	public void setDool() {
		dool = ban * 2 * 3.14;		
	}
	
	public void setArea() {
		area = ban * ban * 3.14;		
	}
	
	// ����Լ� - Dohyung�� toPrint() Overriding
	public void toPrint(String print) {
		System.out.printf("���� ������ : %3d\n���� �ѷ� : %5.2f\n���� ���� : %5.2f\n" , ban , dool, area);
		
	}
	
	
	public static void main(String[] args) {
		new Dongl();
		
	}

}
