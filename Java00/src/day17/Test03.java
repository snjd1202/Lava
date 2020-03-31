package day17;

import java.util.*;
public class Test03 {

	public Test03() {
		// <Sagak>, <> �ȿ� �ִ� Ÿ������ ���� ����ȯ�ؼ� ����Ʈ�� �ְڴ� (���ʸ���)
		ArrayList<Sagak> list = new ArrayList<Sagak>();
		for(int i = 0; i < 10; i ++) {
			
			list.add(new Sagak((int)(Math.random()*16+5), (int)(Math.random()*16+5)));
		}
		
		// ��������
		for(int i = 0; i < 10; i ++) {
			System.out.printf("%2d ] %5.0f", i+1, list.get(i).getArea());
			System.out.println();
		}
		System.out.println("���� for�� ó��");
		// ���� foró��
		int num = 1;
		for(Sagak s : list) {
			System.out.printf("%2d ] %5.0f", num++, s.getArea());
			System.out.println();
		}
		
		ArrayList<List> list2 = new ArrayList<List>();
		
		list2.add(new Vector());
		list2.add(new ArrayList());
		list2.add(new LinkedList());
		// List�迭�̶� List �� ���� ����ȯ�� �����ϱ� ������ add����.
		
		ArrayList<Collection> list3 = new ArrayList<Collection>();
		list3.add(new Vector());
		list3.add(new ArrayList());
		list3.add(new LinkedList());
		list3.add(new HashSet());
		list3.add(new TreeSet());
		// Collection ���� �ϸ� List�迭, set �迭 �� �� ����������, Map�迭�� �ȵ�.
//		list3.add(new HashMap());
		
		
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
