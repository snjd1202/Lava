package day17;

import java.util.*;
public class Test03 {

	public Test03() {
		// <Sagak>, <> 안에 있는 타입으로 강제 형변환해서 리스트에 넣겠다 (제너릭스)
		ArrayList<Sagak> list = new ArrayList<Sagak>();
		for(int i = 0; i < 10; i ++) {
			
			list.add(new Sagak((int)(Math.random()*16+5), (int)(Math.random()*16+5)));
		}
		
		// 꺼내보자
		for(int i = 0; i < 10; i ++) {
			System.out.printf("%2d ] %5.0f", i+1, list.get(i).getArea());
			System.out.println();
		}
		System.out.println("향상된 for문 처리");
		// 향상된 for처리
		int num = 1;
		for(Sagak s : list) {
			System.out.printf("%2d ] %5.0f", num++, s.getArea());
			System.out.println();
		}
		
		ArrayList<List> list2 = new ArrayList<List>();
		
		list2.add(new Vector());
		list2.add(new ArrayList());
		list2.add(new LinkedList());
		// List계열이라서 List 로 강제 형변환이 가능하기 때문에 add가능.
		
		ArrayList<Collection> list3 = new ArrayList<Collection>();
		list3.add(new Vector());
		list3.add(new ArrayList());
		list3.add(new LinkedList());
		list3.add(new HashSet());
		list3.add(new TreeSet());
		// Collection 으로 하면 List계열, set 계열 둘 다 가능하지만, Map계열은 안됨.
//		list3.add(new HashMap());
		
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
