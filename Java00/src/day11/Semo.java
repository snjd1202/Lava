package day11;


public class Semo extends Dohyung{
	int width;
	int height;
	
	public Semo() {
		this(3,3);
	}
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
//		toPrint();	
	}
	
	public void setArea() {
		area = width * height * 0.5;
	}
	
	public void toPrint() {
		System.out.printf("���α��� : %3d\n���α��� : %3d\n�ﰢ���� ���� : %5.2f\n" , width , height, area);
	}
	
	public static void main(String[] args) {
		new Semo();
	}

}
