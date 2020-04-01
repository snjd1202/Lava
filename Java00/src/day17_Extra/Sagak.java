package day17_Extra;
/*
 	문제 2]
 		사각형 클래스를 만들고
 		사각형의 가로길이가 같으면 같은 클래스로 처리되도록 하세요.
 		==> equals() 오버라이드 하세요.
 		
 		그리고 각각 다른 사각형을 5개를 컬렉션에 저장하고 출력하세요.
 		
 		
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
		String str = "이 tk각형은 밑변이 " + width + ", 높이가 " 
								+ height + ", 넓이가 "+ area + " 인 tk각형입니다.";
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
