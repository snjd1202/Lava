package day10;

/**
 * 이 클래스는 학생 한명의 이름, 국어, 영어, 수학, 물리, 코딩 점수를 
 * 저장할 용도의 클래스
 * @author 김수진
 * @since 2020.03.20
 * @version v.1.0
 * @see
 */
public class Stu {
	// 멤버변수 선언
	String name;
	int kor, eng, math, phys, cod;
	
	public Stu() {
		
	}
	
	public Stu(String name) {
		this.name = name;
		this.kor  = (int)(Math.random() * 41 + 60);
		this.eng  = (int)(Math.random() * 41 + 60);
		this.math = (int)(Math.random() * 41 + 60);
		this.phys = (int)(Math.random() * 41 + 60);
		this.cod  = (int)(Math.random() * 41 + 60);
	}
	
	//총점 구하는 함수
	public int getSum() {
		return kor + eng + math + phys + cod;
	}
	
	public double getAvg() {
		return getSum() / 5.; 
	}
	
	// 출력하는 함수
	public void toPrint() {
		System.out.printf("%5s : %1s|\n", "이름", name);
		System.out.printf("%5s : %5d |\n", "국어", kor);
		System.out.printf("%5s : %5d |\n", "영어", eng);
		System.out.printf("%5s : %5d |\n", "수학", math);
		System.out.printf("%5s : %5d |\n", "물리", phys);
		System.out.printf("%5s : %5d |\n", "코딩", cod);
		System.out.printf("%5s : %5d |\n", "총점", getSum());
		System.out.printf("%5s : %5.2f |\n", "평균", getAvg());
		for(int i = 0; i < 17; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	

}
