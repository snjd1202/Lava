package day13.sub;

public class Dongl implements Moyang {
	private int ban;
	private double area;
	
	public Dongl() {
		
	}
	
	public Dongl(int ban) {
		this.ban = ban;
		setArea();
	}
	@Override
	public void setArea() {
		area = ban * ban * 3.14;
	}

	@Override
	public void toPrint() {
		System.out.println("반지름 : "+ban +" 원 넓이 : "+ area);
	}

}
