package day11.preSolv;

/**
 * 	�� Ŭ������ �л� �Ѹ��� �̸��� ���� ������ ������ �뵵�� Ŭ����
 * @author �����
 * @since 2020.03.23
 * @version v.1.0
 * 
 *
 */
public class Stud {
	// �� Ŭ������ �л� �� ���� �������̹Ƿ�
	// �л��� �̸��� �־�� �ڴ�.
	String name;
	// ���� ������ ������ �������� ������ ��������.
	int kor, eng, math, phys, cod;
	
	// �� Ŭ������ �ν��Ͻ��� �Ǵ� ���� 
	// �ش� �ν��Ͻ��� �����ָ� ������ ������ ������ ����.
	// ����� �ʱ�ȭ ������ �ϴ� �Լ��� ������ �Լ��̹Ƿ�
	// ������ �Լ����� �ԷµǴ� �̸��� �ʱ�ȭ ��Ű��� ����.
	
	public Stud() {
		// �ƹ� �����͵� �Է����� ������ "������"��� �л��� �����ͷ� �ʱ�ȭ �ǰ� ����.
//		this.kor = 100;	==> this() �Լ� ������ ����� ���� ������ ����. 
		this("������");
	}
	
	public Stud(String name) {
		this.name = name;
		setSubj();
	}
	
	// ���� ���� �Է����ִ� �Լ�
	// �����ϰ� �Էµǰ� ����
	public void setSubj() {
		kor = (int)(Math.random() * 41+60);
		eng = (int)(Math.random() * 41+60);
		math = (int)(Math.random() * 41+60);
		phys = (int)(Math.random() * 41+60);
		cod = (int)(Math.random() * 41+60);
	}
	
	// ���� �����ִ� �Լ�.
	// ������ ���� ������ ����.
	// ���� �� �Լ��� ����Ǹ� ������ �˷��ֵ��� �ؾ��Ѵ�.
	public int getSum() {
		// ������� �� ��ȯ
		return kor + eng + math + phys + cod;
	}
	
	// ��� �����ִ� �Լ�
	public double getAvg() {
		return getSum()/5.;
	}
	
	public void toPrint() {
		System.out.printf("%4s : %3d | %3d | %3d | %3d | %3d | %4d | %5.3f\n", name, kor, eng, math, phys, cod, getSum(), getAvg());
	}
	
}
