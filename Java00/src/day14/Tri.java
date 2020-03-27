package day14;

/*
 		���� 2]
		�ﰢ�� Ŭ������ �ۼ��ϰ�
		
		�ﰢ�� Ŭ������ �غ��� ���̸� �Է��ؼ� ��ü�� ���鵵�� �ۼ��ϰ�
		���� 
			�غ��� ������ ���� �ﰢ���� �ǵ��� 
		equals �Լ�, toString()�� �������̵� �ϰ�,
		�׽�Ʈ �ϼ���.
		
		�Է��� JOptionPane �Ҽ��� �Լ��� ó���ϰ�
		��µ� ���� �Ҽ��� �Լ��� ó���ϼ���.
		�߰��� ����ó���� ���ּ���.
 */
import javax.swing.*;
public class Tri {
	private int width;
	private int height;
	private double area;
	
	public Tri(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		toString();

	}
	
	// �ش� Ŭ������ ��ü�� ������ ������ ���ڿ��� ��ȯ���ִ� �Լ�
	public String toString() {
		String str = "�� �ﰢ���� �غ��� " + width + ", ���̰� " 
								+ height + ", ���̰� "+ area + " �� �ﰢ���Դϴ�.";
		return str;
	}
	
	// ���� �����ִ� �Լ�
	public void setArea() {
		area = width * height * 0.5;
	}
	
	// �Լ� ��ȯ���ִ� �Լ�
	public double getArea() {
		return area;
	}
	
	// �Ǵ��ϴ� �Լ�
	public boolean equals(Object obj) {
		// ���� ����ȯ�ϴ� �Լ�
		Tri t = (Tri)obj;
		
		return this.width == t.width;
	}
	
}
