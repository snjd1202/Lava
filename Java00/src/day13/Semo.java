package day13;

public class Semo extends Figure {
	
	private int garo;
	private int sero;
	@Override
	public double calcArea(int... a) {
		garo = a[0];
		sero = a[1]; 
		
		return garo * sero * 0.5;
	}
	public void toPrint() {
//		System.out.println("���� : " + garo + " ���� :" + sero + "���� : " + calcArea());
		System.out.println("���� ���� : " + garo + " ���� ���� :" + sero + " ���� : " + garo*sero);
	};

}
