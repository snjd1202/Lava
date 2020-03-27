package day14;

/*
 		문제 2]
		삼각형 클래스를 작성하고
		
		삼각형 클래스의 밑변과 높이를 입력해서 객체를 만들도록 작성하고
		만약 
			밑변이 같으면 같은 삼각형이 되도록 
		equals 함수, toString()를 오버라이드 하고,
		테스트 하세요.
		
		입력은 JOptionPane 소속의 함수로 처리하고
		출력도 같은 소속의 함수로 처리하세요.
		추가로 예외처리도 해주세요.
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
	
	// 해당 클래스의 객체가 가지는 정보를 문자열로 반환해주는 함수
	public String toString() {
		String str = "이 삼각형은 밑변이 " + width + ", 높이가 " 
								+ height + ", 넓이가 "+ area + " 인 삼각형입니다.";
		return str;
	}
	
	// 넓이 구해주는 함수
	public void setArea() {
		area = width * height * 0.5;
	}
	
	// 함수 반환해주는 함수
	public double getArea() {
		return area;
	}
	
	// 판단하는 함수
	public boolean equals(Object obj) {
		// 강제 형변환하는 함수
		Tri t = (Tri)obj;
		
		return this.width == t.width;
	}
	
}
