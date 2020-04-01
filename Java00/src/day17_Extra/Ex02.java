package day17_Extra;

/*
 	문제 2]
 		사각형 클래스를 만들고
 		사각형의 가로길이가 같으면 같은 클래스로 처리되도록 하세요.
 		==> equals() 오버라이드 하세요.
 		
 		그리고 각각 다른 사각형을 5개를 컬렉션에 저장하고 출력하세요.
 		
 		
 */
import java.util.*;

public class Ex02 {
	public Ex02() {
		HashSet<Sagak> set = new HashSet<Sagak>();
		int cnt = 0;
		for(;;) {
			cnt++;
//			System.out.println(cnt++);
			int width = (int)(Math.random() * 11+5);
			int height = (int)(Math.random() * 11+5);
			set.add(new Sagak(width, height));
			if(set.size() == 5) {
				break;
			}
		}
		System.out.println("실패횟수 : " + ((cnt+1)-5));
		for(Sagak s : set) {
			System.out.print("가로 : " + s.getWidth() + " 세로 : " + s.getHeight());
			System.out.println(" 넓이 : " + s.getArea());
		}
	
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
