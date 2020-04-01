package day17_Extra;

/*
 	���� 2]
 		�簢�� Ŭ������ �����
 		�簢���� ���α��̰� ������ ���� Ŭ������ ó���ǵ��� �ϼ���.
 		==> equals() �������̵� �ϼ���.
 		
 		�׸��� ���� �ٸ� �簢���� 5���� �÷��ǿ� �����ϰ� ����ϼ���.
 		
 		
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
		System.out.println("����Ƚ�� : " + ((cnt+1)-5));
		for(Sagak s : set) {
			System.out.print("���� : " + s.getWidth() + " ���� : " + s.getHeight());
			System.out.println(" ���� : " + s.getArea());
		}
	
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
