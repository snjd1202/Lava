package day12.sub;

public class Tri extends Figure {
	int width;
	int height;
	
	public Tri() {
		
	}
	
//	public Tri(int width, int height) {
//		this.width = width;
//		this.height = height;
//		setArea();
//		toPrint();
//	}
	public Tri(int...arr) {
		this.width = arr[0];
		this.height = arr[1];
		setArea();
		toPrint();
	}
	public void setArea() {
		area = width * height * 0.5;
	}
	
	public void toPrint() {
		System.out.printf("»ï°¢ÇüÀÇ ³ÐÀÌ : %.2f\n", area);
	}
}
