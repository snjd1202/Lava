package exam1;

import java.util.*;
public class Area {
	
	int ban;
	double area;
	
	public Area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���.");
		ban = sc.nextInt();
		getArea();
		toPrint();
	}
	
	public void getArea() {
	 area = 3.14 * ban * ban;
	}

	public void toPrint() {
		System.out.println(area);
	}

	public static void main(String[] args) {
		new Area();
	}

}
