package day03;
/*
 	���� 2]
 		���� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
 					�ڵ�		�⺻���		�����
 		������ 		(1)			3800			245
 		����� 		(2)			2400			157
 		������ 		(3)			2900			169
 		����� 		(4)			3200			174
 		
 		������ = �⺻��� + ��뷮 * �����
 		
 		������ڵ�� ��뷮�� �Է¹޾Ƽ� 
 		�������� ������ִ� ���α׷��� �ۼ��ϼ���.
 */
import java.util.*;
public class Ex03 {

	public Ex03() {
		abc();
	}
	
	 
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) ������ / (2) ����� / (3) ������ / (4) �����");
		System.out.println("����� �ڵ带 �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		if(!(num1 >= 1 && num1 <=4)) {
			System.out.print("�ڵ尡 �߸��Ǿ����ϴ�.");
			return;
		}
		System.out.println("��뷮�� �Է��ϼ���. : ");
		int num2 = sc.nextInt();
		
		int basic = 3800;
		int used = 0;
		int yong = 245;
		int yogum = basic + used * yong;
		String use = ""; 
		 
		if(num1 == 1) {
			yogum = 3800 + num2 * 245;
			use = "������";
		} else { if(num1 == 2) {
//			yogum = 2400 + num2 * 157;
			use = "�����";
		} else { if(num1 == 3) {
//			yogum = 2900 + num2 * 167;
			use = "������";
		} else {
//			yogum = 3200 + num2 * 174;
			use = "�����";
		}
			
		}
			
		}
		System.out.println("�Էµ� " + use + " �ڵ��� ��뷮 " + num2 + "�� " + yogum + "�� �Դϴ�.");
	}
	public static void main(String[] args) {
		new Ex03();

	}

}
