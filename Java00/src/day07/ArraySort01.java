package day07;

import javax.swing.*;
import java.util.*;

/*
 	����]
 		�ζ� �� ������ ���� �迭�� ��� 
 		���� ��ȣ���� �����ؼ� 
 		��� �����͸� ����غ���.
 		
 		�ζ� �� ������ 
 			1 ~ 45 ������ ���ڰ� 6���� �ʿ��ϴ�.
 */
public class ArraySort01 {

	public static void main(String[] args) {
		// ����
		// 1. ���� 6���� ����� �迭�� �����.
		int[] lotto = new int[6];
		// 2. �迭�� �����ϰ� ������ ���� 
		loop:
		for(int i = 0; i < lotto.length; i++) {
			int no = (int)(Math.random()*(45 - 1 + 1) + 1);		
			// 3. ������ ������� ���� ��ȣ�� �ִ��� üũ�ϰ�
			for(int j = 0; j < i; j++) {
				if(lotto[j] == no) { // �������� �߻��� ��ȣ�� ���� ��ȣ��..
					i--;
					continue loop;
				}
			}
			// �� �κ��� �����ϴ� ���� ���� �ݺ����� ��� ������ �� ���� 
			// �� �ǹ̴� ���� ��ȣ�� �������� ���ٴ� �ǹ��̹Ƿ� 
			// 4. �� �濡 �� ��ȣ�� �����ϰ�
			lotto[i] = no;
			
		}
		
		
		// 5. ����ϰ�
		JOptionPane.showMessageDialog(null, Arrays.toString(lotto));
		
		// 6. ������ �ϰ�
		for(int i = 0; i < lotto.length - 1; i++) {
			// ���⼭ ���� �����ʹ� �� ������ �����ʹ� ���� �ʿ䰡 �����Ƿ�
			// �� ������ �ٷ� ���������� �̾Ƽ� �����ָ� �ȴ�.
			
			// ���� ������ ���ĺ��� �� ���������� �ϳ��� ������ ���Ѵ�.
			for(int j = i + 1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					// �� ���� �ڿ��� �̾ƿ� �����Ͱ� �� ���� ����̹Ƿ� 
					// ���� �ڸ��� �����͸� ��ü�ؾ� �Ѵ�.
					// �� �� ���� �ڸ��� �����͸� ��ü�ϴ� ���� ���� �������� ����� ������Ƿ�
					// ������ �ּҸ� ������ ���´�.
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		// 7. ����ϰ�
		JOptionPane.showMessageDialog(null,"<html><b style=\"color : red;\">�١١ٴ�÷��ȣ�١١�</b></html>\n"+
				Arrays.toString(lotto));

	}

}
