package day03;
/*
 	���� 3]
 		�μ���ȣ�� �Է��ϸ� 
 		�μ��̸��� ������ִ� ���α׷��� �ۼ��ϼ���.
 		
 		10 - �ѹ���
 		20 - ȸ���
 		30 - ������
 		40 - �����
 		������ - ��
 */
import java.util.*;
public class Ex04 {

	public Ex04() {
		abc();
	}
	
	public void abc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ���ȣ�� �Է��ϼ���. : ");
		int num1 = sc.nextInt();
		String dept = "";
		if (num1 == 10) {
			dept = "�ѹ���";
		} else if(num1 == 20){
			dept = "ȸ���";
		} else if(num1 == 30) {
			dept = "������";
		} else if(num1 == 40){
			dept = "�����";
		} else {
			dept = "��";
		}
		System.out.println("�Է��� �μ���ȣ " + num1 + " �� �μ��̸��� " + dept + " �Դϴ�.");
	}
	
	public static void main(String[] args) {
		new Ex04();

	}

}
