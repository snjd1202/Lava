package exam1;

public class Ex04 implements Calc {

	int no1;
	int no2;
	
	public Ex04() {}
	
	public Ex04(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
	}
	@Override
	public double cal(int no1, int no2) {
		this.no1 = no1;
		this.no2 = no2;
		return no1 + no2;
	}
}
