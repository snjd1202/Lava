package day18;

/*
 	���� 2]
 		�л��� �̸�, ��ȣ, ��, ����, ����, ����, ����, ���
 		�� ������ VO Ŭ������ �����
 		
 		5�л��� �����͸� �Է��ؼ� ������ Set�� ���� Collection TreeSet
 		�̸������� ����ϼ���.
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
		String name[] = {"�����","������","����ö","������","�輺��"};
		for(int i = 0; i < 5; i++) {
			String str = name[i];
			ban = (int)(Math.random() * (3-1+1)+1);
			num = (int)(Math.random()* (30-1+1)+1);
			kor = (int)(Math.random() * (100-60+1)+60);
			eng = (int)(Math.random() * (100-60+1)+60);
			math = (int)(Math.random() * (100-60+1)+60);
			
			set.add(new Stud(str, ban, num, kor, eng, math));
//			System.out.println(name[i]+ " "+ban+"��, "+num+"��, ���� : "+kor+", ���� : "+eng+", ���� : "+math);	
		}
//		ArrayList<Stud> list = new ArrayList<Stud>(set);
		for(Stud s : set) {
			System.out.println(s.getName() + " | "+s.getBan()+"��, "+s.getNum()+"��, ���� : "+s.getKor()+", ���� : "+s.getEng()+", ���� : "+s.getMath()+" ���� : " +s.getTotal()+ " , ��� : "+ s.getAvg());
//			System.out.print(s + " | ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
