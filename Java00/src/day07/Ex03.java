package day07;

/*
 	���� 3]
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� �����, - ���ڿ� �迭 3��
	�����͸� �Է��س���
	�̸��� �Է��ϸ� 
	�� ����� �����͸� ��� ������ �迭�� ����
	�����͸� �ְ� ����ϼ���.
 */
import javax.swing.*;
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		String[] name = {"�����", "������", "����ö", "������", "�輺��"};
		String[] tel = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		String[] mail = {"ksj@increpas.com","sej@increpas.com","lhc@increpas.com","ljs@increpas.com","ksh@increpas.com"};
		String str = JOptionPane.showInputDialog("�̸��� �Է��ϼ���. : ");
		int idx = -1;
		for(int i = 0; i < name.length; i++) {
			String[] info = new String[] {name[i],tel[i],mail[i]};
			if(name[i].equals(str)) {
				idx = i;
				JOptionPane.showMessageDialog(null,info);
				System.out.println(Arrays.toString(info));
		}
			
			
//		for(int j = 0; j < name.length; j++) {
//			if(name[i].equals(str)) {
//				info[i] = name[i];
//				info[i+1] = tel[i];
//				info[i+2] = mail[i];
//				}			
//			}
		}
	}
}

