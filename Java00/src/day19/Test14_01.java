package day19;

/*
 	fr01.txt ������ �о��.
 	�� ������ ObjectOutputStream���� ������ �����̹Ƿ�
 	�ݵ�� ������ �� ����� Ŭ������ �д� �ʿ��� ��Ű���� �����̸����� �Ȱ��� �����ؾ��ϰ�
 	�ݵ�� ObjectInputStream�� ����켭 �о�� �Ѵ�.
 */

import java.io.*;
import javax.swing.*;
public class Test14_01 {

	public Test14_01() {
		// Ÿ�ٽ�Ʈ�� �غ��ϰ� 
		FileInputStream fin = null;
		// ������Ʈ�� �غ�
		ObjectInputStream oin = null;
		 
		try {
			// ��Ʈ�� �����
			fin = new FileInputStream("src/day19/etc/fr01.txt");
			oin = new ObjectInputStream(fin);
			
			// ������ �� Ŭ������ ����������
			// ���� ���� Ŭ������ ����.
			Friend fr = (Friend) oin.readObject();
			JOptionPane.showMessageDialog(null, fr.getName() + "\n" +
												fr.getTel() + "\n" +
												fr.getMail() + "\n" + 
												fr.getAge() + "\n" + 
												fr.getHeight() + "\n" + 
												fr.getGen()
					);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				oin.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test14_01();
	}

}
