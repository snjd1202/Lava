package day07;

/*
 	���� 4]
	��ȭ��ȣ�� �Է��ϸ� 
	'-' �� �������� �����͸� �и��ؼ�
	������ �迭�� ����� �и��� �����͸� ������ �°� �Է��ϰ� ����ϼ���.
	indexOf()
	substring()
 */
import javax.swing.*;
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("��ȭ��ȣ�� �Է��ϼ���.");
		String[] arr = new String[3];
		int ch = str.indexOf('-');
			arr[0] = str.substring(0,ch);
			String tmp = str.substring(ch + 1);
			ch = tmp.indexOf('-');
			arr[1] = tmp.substring(0,ch);
			arr[2] = tmp.substring(ch + 1);
			
		
//		String tmp = str.substring(ch+1);
//		ch = tmp.indexOf('-');
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = tmp.substring(0,ch); 
//			
//					
//					
//		}
		JOptionPane.showMessageDialog(null, arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
