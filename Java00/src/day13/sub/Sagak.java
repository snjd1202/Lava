package day13.sub;

public class Sagak implements Moyang {
	private int width;
	private int height;
	private double area;
	
	public Sagak() {
		
	}
	
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public void setArea() {
		area = width * area;
		
	}

	@Override
	public void toPrint() {
		System.out.println("가로 : " + width +" 세로 : "+ height+" 사각형 넓이 : "+area);
				
		
	}

}
