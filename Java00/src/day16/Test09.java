package day16;

import java.util.*;
public class Test09 {

	public Test09() {
//		ArrayList list = new ArrayList();
		// list�� ������ ä���
//		list.add("��ö");
//		list.add("����");
//		list.add("����");
//		list.add("����");
//		list.add("����");
		
		HashSet list = new HashSet();
		list.add("��ö");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		// list �迭�� ������ �Լ��� �־ �� �Լ��� ����ϴ� ���� ���ϴ�.
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i)+", ");
//		
//	}
		// 2. Iterator �� ��������. ArrayList �Ҽ��� iterator()�� ȣ�����ָ� �ȴ�.
		Iterator itor = list.iterator();
		
		while(itor.hasNext()) {
			// hasNext()	==> ���ۿ� ���� �����Ͱ� ������ true, ������ false�� ��ȯ���ش�.
			String tmp = (String)itor.next();
			// ���������� �ϳ��� ������ �ϴµ�
			// ������ �Լ��� next() �ε� ��ȯ�� Ÿ���� Object �̹Ƿ� ������ ��������ȯ�ؼ� ����ؾ� �Ѵ�.
			System.out.print(tmp + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test09();
	}

}
