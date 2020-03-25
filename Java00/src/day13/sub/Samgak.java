package day13.sub;

public class Samgak implements Moyang {
	private int width;
	private int height;
	private double area;
	
	public Samgak() {
		
	}
	
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public void setArea() {
		area = width * height * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.println("°¡·Î : " + width +" ¼¼·Î : "+ height +" »ï°¢Çü ³ÐÀÌ : "+ area);
	}

}
