package day12.sub;

public class Squa extends Figure {
	int width;
	int height;
	
	public Squa() {
		
	}
	
//	public Squa(int width, int height) {
//		this.width = width;
//		this.height = height;
//		setArea();
//		toPrint();
//	}
	public Squa(int...arr) {
		this.width = arr[0];
		this.height = arr[1];
		setArea();
		toPrint();
	}
	
	public void setArea() {
		area = width * height;
	}
	
	public void toPrint() {
		System.out.printf("사각형의 넓이 : %.2f\n",area);
	}

}
