package day07;

import javax.swing.JOptionPane;

/*
 	extra]
	���� ���ڿ��� �Է¹޾Ƽ� 
	�ش� ���ĺ��� �����ϴ� �󵵸� �����ϰ�
	�󵵸� * �� ǥ���ϼ���.
 */
import javax.swing.*;
import java.util.*;
public class Extra {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("���� ���ڿ��� �Է��ϼ���.");
		String[] arr = new String[str.length()];
		int cnt = 0;
		
		
		for(int i = 0; i < str.length(); i++) {
			String ch = str.substring(i,i+1);
			arr[i] = ch;
			for(int j = 0; j < i; j++) {
				if(ch.equals(i)) {
					
					}
				
				}
				
			}
		
		
//		for(int i = 0; i < str.length();i++) {
//			for(int j = i + 1; j < str.length(); j++) {
//				String temp= arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
				
			
//			}
//		}
		
		JOptionPane.showMessageDialog(null, Arrays.toString(arr));
//		JOptionPane.showMessageDialog(null, arr);
//		System.out.println(Arrays.toString(arr));

	}

}
