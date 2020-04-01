package day18;
/*
	���� 2]
		�л��� �̸�, ��ȣ, ��, ����, ����, ����, ����, ���
		�� ������ VO Ŭ������ �����
		
		5�л��� �����͸� �Է��ؼ� ������ Set�� ���� Collection TreeSet
		�̸������� ����ϼ���.
*/
public class Stud implements Comparable{
	private String name;
	private int num;
	private int ban;
	private int kor, eng, math, total;
	private double avg;
	
	public Stud() {}

	public Stud(String name, int ban, int num, int kor, int eng, int math) {
		this.name = name;
		this.num = num;
		this.ban = ban;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		setAvg();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal() {
		this.total = kor + eng + math;
	}

	public double getAvg() {
		return avg;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public void setAvg() {
		this.avg = total / 3;
	}

	@Override
	public int compareTo(Object o) {
		Stud s = (Stud) o;
		 int result = this.getName().compareTo(s.getName());
		return result;
	}
	
}
