package day19;

/*
 	���ڴ����� ���Ͽ� �����͸� �����ϴ� ���α׷��� �ۼ��غ���.
 	
 */
import java.io.*;
import javax.swing.*;
public class Test10 {

	public Test10() {
		// ��Ʈ�� �غ��ϰ�
		FileWriter fw = null;
		try { 
			// ��Ʈ�� �ʱ�ȭ
			fw = new FileWriter("src/day19/etc/FileWriter_test.txt");
			
			/*
			// 1. �� ���ڸ� (2byte) �����غ���.
			char ch = '��';
			fw.write(ch);
			*/
			
			/*
			// 2. �������� ����
			String str = "���� �׻� �� �˴ϴ�.";
			char[] buff = str.toCharArray();
			fw.write(buff);
			*/
			
			// 3. ���ڿ��� �����غ���.
			String str = "��, �����ϸ� ���ҰŴ�?";
			fw.write(str);
			/*
			 	char ���� ��Ʈ���� �ؽ�Ʈ �����͸� ó���ϵ��� �Ǿ��ֱ� ������ 
			 	�⺻ �Լ��� + ���� ó�� ����� �߰��Ǿ���.
			 */
			JOptionPane.showMessageDialog(null, "### ���� ���� �Ϸ� ###");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
