package day17_Extra;
/*
 	���� 2]
 		�簢�� Ŭ������ �����
 		�簢���� ���α��̰� ������ ���� Ŭ������ ó���ǵ��� �ϼ���.
 		==> equals() �������̵� �ϼ���.
 		
 		�׸��� ���� �ٸ� �簢���� 5���� �÷��ǿ� �����ϰ� ����ϼ���.
 		
 		
 */

import day14.Tri;

public class Sagak implements Comparable{
	private int width, height;
	private int area;
	
	public Sagak() {}
	
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		toString();
	}

	@Override
	public int compareTo(Object o) {
		Sagak s = (Sagak)o;
		int result = s.getArea() - this.getArea();
		
		return result;
	}
	public String toString() {
		String str = "�� tk������ �غ��� " + width + ", ���̰� " 
								+ height + ", ���̰� "+ area + " �� tk�����Դϴ�.";
		return str;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {
		this.area = width * height;
	}
	
	public int hashCode() {
		return width;
	}
	
	public boolean equals(Object obj) {
		Sagak s = (Sagak)obj;
		
		return (this.width == s.width) ? true : false;
	}


}
