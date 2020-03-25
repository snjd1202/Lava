package day13;

public class Nemo extends Figure {
	private int width;
	private int height;
	@Override
	public double calcArea(int... a) {
		width = a[0];
		height = a[1];
		
		return width * height;
	}
	public void toPrint() {
		System.out.println("네모 가로 : " + width + " 네모 세로 :" + height + " 넓이 : " + width * height);
	};

}
