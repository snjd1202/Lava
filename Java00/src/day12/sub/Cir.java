package day12.sub;

public class Cir extends Figure {
	int ban;
	
	public Cir() {
		
	}
	
//	public Cir(int ban) {
//		this.ban = ban;
//		setArea();
//		toPrint();
//	}
	
	public Cir(int...arr) {
		this.ban = arr[0];
		setArea();
		toPrint();
	}
	
	public void setArea() {
		area = ban * ban;
	}
	
	public void toPrint() {
		System.out.printf("¿øÀÇ ³ĞÀÌ : %3.2f\n",area);
	}

}
