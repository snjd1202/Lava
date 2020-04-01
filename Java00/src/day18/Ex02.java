package day18;

/*
 	문제 2]
 		학생의 이름, 번호, 반, 국어, 영어, 수학, 총점, 평균
 		을 저장할 VO 클래스를 만들고
 		
 		5학생의 데이터를 입력해서 관리할 Set을 만들어서 Collection TreeSet
 		이름순으로 출력하세요.
 */
import java.util.*;
public class Ex02 {

	public Ex02() {
		int ban = 0;
		int num = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		TreeSet<Stud> set = new TreeSet<Stud>();
		String name[] = {"김수진","손은진","이한철","이진수","김성현"};
		for(int i = 0; i < 5; i++) {
			String str = name[i];
			ban = (int)(Math.random() * (3-1+1)+1);
			num = (int)(Math.random()* (30-1+1)+1);
			kor = (int)(Math.random() * (100-60+1)+60);
			eng = (int)(Math.random() * (100-60+1)+60);
			math = (int)(Math.random() * (100-60+1)+60);
			
			set.add(new Stud(str, ban, num, kor, eng, math));
//			System.out.println(name[i]+ " "+ban+"반, "+num+"번, 국어 : "+kor+", 영어 : "+eng+", 수학 : "+math);	
		}
//		ArrayList<Stud> list = new ArrayList<Stud>(set);
		for(Stud s : set) {
			System.out.println(s.getName() + " | "+s.getBan()+"반, "+s.getNum()+"번, 국어 : "+s.getKor()+", 영어 : "+s.getEng()+", 수학 : "+s.getMath()+" 총점 : " +s.getTotal()+ " , 평균 : "+ s.getAvg());
//			System.out.print(s + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
