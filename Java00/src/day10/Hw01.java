package day10;

/*
 * ���� 1]

	�л��� �̸�, ����, ����, ����, ����, �ڵ� ������ �����ϴ� Ŭ������ �����ϰ�,
	�л��� �����͸� �غ�� ��ŭ�� �Է��ؼ� 
	��ü ����, ��ü ����� ���ϴ� ���α׷��� �ۼ��ϼ���. ( �����μ� ��� )
 */
import java.util.*;
public class Hw01 {
	String name[] = {"�����","����ö","������","�輺��","������"};
//	String[] sub = {"����","����","����","����","�ڵ�"};
	int[][] sub = new int[5][5];
	int sum;
	
	
	
	
	public void jumsu() {
		for(int i = 0; i < sub.length; i++) {
			for(int j = 0; j < sub[i].length; j++) {
				
				int no = (int)(Math.random() * (100 - 1 + 1) + 1);
				sub[i][j] = no;
			}
//			System.out.println(sub[i]);
		}
	}
	
	public void setSum() {
		int num = 0;
		for(int i = 0; i < sub.length; i++) {
			for(int j = 0; j < sub[i].length; j++) {
				num += sub[i][j];
			}
		}
		sum = num;
	}

	public double setAvg() {
		return sum/5.;
	}
	
	public void toPrint() {
		for(int i = 0; i < sub.length; i++) {
			System.out.println("�̸� : " + name[i]);
			for(int j = 0; j < sub[i].length; j++) {
				System.out.print(sub[i][j] + " ");
			}
			System.out.println();
			System.out.println("--------------");
			
		}
		System.out.println("��ü ���� : " + sum);
		System.out.println("��ü ��� : " + setAvg());
		System.out.println();
	}
	
}
