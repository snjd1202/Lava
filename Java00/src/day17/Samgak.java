package day17;

public class Samgak {
	// �ﰢ�� ���� ����
	private int width, height;
	private double area;
	// �⺻������ �Լ�
	public Samgak() {}
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea(width, height);
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
	public double getArea() {
		return area;
	}
	public void setArea(int width, int height) {
		this.width = width;
		this.height = height;
		area = width * height * 0.5;
	}
		
		public void setArea(double area) {
			this.area = area;
	}

}
