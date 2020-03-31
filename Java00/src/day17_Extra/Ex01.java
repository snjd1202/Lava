package day17_Extra;

/*
 	학생 성적을 관리하기 위한 클래스를 제작하세요.
 	class name : Stud
 	변수
 		String name;
 		int no;
 		int kor, eng, math, physics, cod, total;
 		
 		과목점수는 객체를 만들 때 랜덤하게 입력되는 것으로 하고
 		반은 한반으로만 하고
 		데이터를 입력해서
 		총점이 높은 순으로 정렬해서 
 		출력하세요.
 		
 		 ArrayList로 풀어보세요.
 */
import java.util.*;
public class Ex01 {

	public Ex01() {
		// Stud 타입 리스트 만들고
		ArrayList<Stud> list = new ArrayList<Stud>();
		// 한 반 10명 랜덤점수 만들고
		String name[] = {"김수진","손은진","이한철","이진수","김성현","김이슬","서동혁","박기윤","이명환","우현우"};
//		List<String> nameList = Arrays.asList(name);
		
//		System.out.println(nameList.toString());
		for(int i = 0; i < 10; i++) {
			String str = name[i];
			int no1 = (int)(Math.random() * (100-60+1)+60);
			int no2 = (int)(Math.random() * (100-60+1)+60);
			int no3 = (int)(Math.random() * (100-60+1)+60);
			int no4 = (int)(Math.random() * (100-60+1)+60);
			int no5 = (int)(Math.random() * (100-60+1)+60);
			// 리스트에 점수 넣고
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
