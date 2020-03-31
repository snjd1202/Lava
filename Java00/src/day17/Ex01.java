package day17;

import java.util.*;
public class Ex01 {

	public Ex01() {
		// ArrayList 만들고
		ArrayList<Semo> list = new ArrayList<Semo>();
		// width, height 값 랜덤으로 10개 만들어서 넣고,
		for(int i = 0; i < 10; i++) {
			int no1 = (int)(Math.random()* (10-5+1) + 5);
			int no2 = (int)(Math.random()* (10-5+1) + 5);
			list.add(new Semo(no1, no2));
		}
		// list에 들어있던 데이터를 sm에 넣어서 출력
		for(Semo sm : list) {
			System.out.print(sm.getArea() + " | ");
		}
		System.out.println();
		// sort()로 list를 정렬한다
		Collections.sort(list);
		// 정렬된 list를 출력한다.
		for(Semo sm : list) {
			System.out.print(sm.getArea() + " | ");
		}
		System.out.println();
		
		// Comparator , 밑변 기준 정렬
		Collections.sort(list, new Semo02());
		// 정렬된 list를 출력한다.
		for(Semo sm : list) {
			System.out.print(sm.getWidth() + " | ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
