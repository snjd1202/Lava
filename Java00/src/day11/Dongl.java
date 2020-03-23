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
	
	// 출력함수 - Dohyung의 toPrint() Overriding
	public void toPrint(String print) {
		System.out.printf("원의 반지름 : %3d\n원의 둘레 : %5.2f\n원의 넓이 : %5.2f\n" , ban , dool, area);
		
	}
	
	
	public static void main(String[] args) {
		new Dongl();
		
	}

}
