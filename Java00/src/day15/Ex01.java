package day15;

import java.util.regex.*;

import javax.swing.*;

/*
 	���� 1]
 	
 		�̸����� �Է¹޾Ƽ�
 		�Է¹��� ���ڿ��� �̸��� ���Ŀ� �´��� �ƴ��� �˻��ϼ���.
 		�̸��� ������
 			���ĺ��� ���ڷ� 8���� �̻����� �ϰ� @ �������ּ�
 		�� ó���ϼ���.
 			
 		����]
 			�ѱ� ó�� : [��-�R] 
 		
 */
public class Ex01 {
	public Ex01(){
		// ��ȭ��ȣ �Է¹ޱ�
		String mail = JOptionPane.showInputDialog("�̸����� �Է��ϼ���.");
		// ���� �����
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}@[a-zA-Z0-9].*");
		Matcher match = pattern.matcher(mail);
		// �˻���
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "�ùٸ� �̸��� �����Դϴ�.");
		} else {
			JOptionPane.showMessageDialog(null, "�ùٸ��� ���� �̸��� �����Դϴ�.");			
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
