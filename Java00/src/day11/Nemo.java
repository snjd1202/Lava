package day11;

public class Nemo extends Dohyung{
	int width;
	int height;
	
	public Nemo() {
		this(3,3);
	}
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
//		toPrint();
	}
	
	public void setArea() {
		area = width * height;
	}
	
	public void toPrint() {
		System.out.printf("���α��� : %3d\n���α��� : %3d\n�簢���� ���� : %5.2f\n" , width , height, area);
	}
	
	public static void main(String[] args) {
		new Nemo();
	}

}
