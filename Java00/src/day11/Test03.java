package day11;

public class Test03 {
	int no1 = 10; // 1. ����� �ʱ�ȭ
	int no2;
	static int no3;
	int no4;
	
	{
		no2 = 20; // 2. �ʱ�ȭ ���� �̿��� �ʱ�ȭ
	}
	
	static {
		no3 = 30; // 3. static ���� �̿��� �ʱ�ȭ
//		no2 = 40;	<== static ��� ������ ���ؼ��� �ʱ�ȭ�� �����ϴ�.
	}
	
	
	public Test03() {
		this.no4 = 50; // 4. ������ �Լ��� �̿��� �ʱ�ȭ
		System.out.println("no1 : " + no1);
		System.out.println("no2 : " + no2);
		System.out.println("no3 : " + no3);
		System.out.println("no4 : " + no4);
	}
	
	public static void main(String[] args) {
		new Test03();
		
	}

}
