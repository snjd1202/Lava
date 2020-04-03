package day19;

/*
 	Friend�� �����͸� ä���� ���Ͽ� �״�� �����غ���.
 */
import java.io.*;
import javax.swing.*;
public class Test14 {

	public Test14() {
		// Ÿ�� ��Ʈ�� �غ�
		FileOutputStream fout = null;
		// ������Ʈ��
		ObjectOutputStream oout = null;
		 
		try {
			// ��Ʈ�� �����
			fout = new FileOutputStream("src/day19/etc/fr01.txt");
			oout = new ObjectOutputStream(fout);
			
			// Friend �� ����� �����͸� ä���ش�.
			Friend f1 = new Friend("����", "010-1111-1111", "chopa@increpas.com", 25, 90.0f, 'M');
			
			// �����͸� �ѱ�� 
			oout.writeObject(f1);
			
			JOptionPane.showMessageDialog(null, "*** Mission complete ***");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test14();
	}

}
