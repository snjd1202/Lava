package day12;

public class Stu_01 {
	
	public Stu_01() {
		Stu s = new Stu();
//		Stu[] = new Stu[5];
		
		for(int i = 0; i < 5; i++) {
			s.setRandom();
			s.toPrint();			
		}
	}

	public static void main(String[] args) {
		new Stu_01();
		
	}

}
