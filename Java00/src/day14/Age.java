package day14;

/*
 		����2]
	
	if - else if ������ ����ؼ�
	
	���̸� �Է��ϸ� �ʴ�, �̽ʴ�,...
	�Ǻ����ִ� ���α׷��� �ۼ��ϼ���.
 */

/*
 	�߰��н�]
 	���α���� �Լ��� �����ؼ� ó���ϼ���.
 */
import javax.swing.*;
public class Age {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("���̸� �Է��ϼ���.");
//		int age = Integer.parseInt(str);
		int age = 0;
		String msg = "";
		
		try {
			age = Integer.parseInt(str);
			if(age <= 9) {
				msg = "��� �Դϴ�.";
			} else if(age/10 == 1) {
				msg = "10�� �Դϴ�.";
			} else if(age/10 == 2){
				msg = "20�� �Դϴ�.";
			} else if(age/10 == 3) {
				msg = "30�� �Դϴ�.";
			} else if(age/10 == 4) {
				msg = "40�� �Դϴ�.";
			} else if(age/10 == 5) {
				msg = "50�� �Դϴ�.";
			} else if(age/10 == 6) {
				msg = "60�� �Դϴ�.";
			} else if(age/10 == 7) {
				msg = "70�� �Դϴ�.";
			} else if(age/10 == 8) {
				msg = "80�� �Դϴ�.";
			} else if(age/10 == 9) {
				msg = "90�� �Դϴ�.";
			} else {
				msg = "����� �Դϴ�.";
			} 		
	}	catch(Exception e) {
				msg = "���������� �ƴմϴ�.";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
	}


