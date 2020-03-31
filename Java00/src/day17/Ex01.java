package day17;

import java.util.*;
public class Ex01 {

	public Ex01() {
		// ArrayList �����
		ArrayList<Semo> list = new ArrayList<Semo>();
		// width, height �� �������� 10�� ���� �ְ�,
		for(int i = 0; i < 10; i++) {
			int no1 = (int)(Math.random()* (10-5+1) + 5);
			int no2 = (int)(Math.random()* (10-5+1) + 5);
			list.add(new Semo(no1, no2));
		}
		// list�� ����ִ� �����͸� sm�� �־ ���
		for(Semo sm : list) {
			System.out.print(sm.getArea() + " | ");
		}
		System.out.println();
		// sort()�� list�� �����Ѵ�
		Collections.sort(list);
		// ���ĵ� list�� ����Ѵ�.
		for(Semo sm : list) {
			System.out.print(sm.getArea() + " | ");
		}
		System.out.println();
		
		// Comparator , �غ� ���� ����
		Collections.sort(list, new Semo02());
		// ���ĵ� list�� ����Ѵ�.
		for(Semo sm : list) {
			System.out.print(sm.getWidth() + " | ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
