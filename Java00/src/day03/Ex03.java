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
		System.out.print("��뷮�� �Է��ϼ���. : ");
		int num2 = sc.nextInt();
		int home = 3800;
		int ind = 2400;
		int edu = 2900;
		int sang = 3200;
		int yogum = 0;
		String use = ""; 
		 
		if(num1 == 1) {
			yogum = home + num2 * 245;
			use = "������";
		} else { if(num1 == 2) {
			yogum = ind + num2 * 157;
			use = "�����";
		} else { if(num1 == 3) {
			yogum = edu + num2 * 167;
			use = "������";
		} else {
			yogum = sang + num2 * 174;
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
