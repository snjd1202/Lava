package day17_Extra;

/*
 	�л� ������ �����ϱ� ���� Ŭ������ �����ϼ���.
 	class name : Stud
 	����
 		String name;
 		int no;
 		int kor, eng, math, physics, cod, total;
 		
 		���������� ��ü�� ���� �� �����ϰ� �ԷµǴ� ������ �ϰ�
 		���� �ѹ����θ� �ϰ�
 		�����͸� �Է��ؼ�
 		������ ���� ������ �����ؼ� 
 		����ϼ���.
 		
 		 ArrayList�� Ǯ�����.
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		// Stud Ÿ�� ����Ʈ �����
		ArrayList<Stud> list = new ArrayList<Stud>();
		// �� �� 10�� �������� �����
		String name[] = {"�����","������","����ö","������","�輺��","���̽�","������","�ڱ���","�̸�ȯ","������"};
//		List<String> nameList = Arrays.asList(name);
		
//		System.out.println(nameList.toString());
		for(int i = 0; i < 10; i++) {
			String str = name[i];
			int no1 = (int)(Math.random() * (100-60+1)+60);
			int no2 = (int)(Math.random() * (100-60+1)+60);
			int no3 = (int)(Math.random() * (100-60+1)+60);
			int no4 = (int)(Math.random() * (100-60+1)+60);
			int no5 = (int)(Math.random() * (100-60+1)+60);
			// ����Ʈ�� ���� �ְ�
			list.add(new Stud(str,no1,no2,no3,no4,no5));
//			Stud s = new Stud(no1,no2,no3,no4,no5);
//			s.setName(nameList.get(i));
//			list.add(s); 
		}
		
		for(Stud s : list) {
			System.out.print(s.getName() + " : " + s.getTotal() + " | ");
		}
		System.out.println();
		
		Collections.sort(list);
		for(Stud s : list) {
			System.out.print(s.getName() + " : " + s.getTotal() + " | ");
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
