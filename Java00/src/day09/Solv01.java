package day09;

/*
 	���� 1]
	�������� �����ϰ� �߻��ؼ�	- �Լ���.. 
	�� �������� �Է��ϸ� 
	���� ���̸� �����ִ� �Լ���
	���� �ѷ��� �����ִ� �Լ��� �����ϰ�
	�����ؼ� ����ϼ���.
 */
public class Solv01 {
	int no;
	double nul;
	double dool;
	
	public void ban() {
		no = (int)(Math.random() * (50-1+1) + 1);
		
		System.out.println(no);
	}
	
	public void nulbi() {
		nul = no * no * 3.14;
		
		System.out.println(nul);
	}
	
	public void doole() {
		dool = no * 2 * 3.14;
		
		System.out.println(dool);
	}
	
	
	
}
