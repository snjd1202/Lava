package day18;

import java.io.*;
import java.util.*;
import javax.swing.*;
public class Test03 {

	public Test03() {
		// Properties �غ�
		Properties prop = new Properties();
		// ������ ä���
		// Properties �� Map�� �����̹Ƿ� �����͸� ä�ﶧ�� Mapó�� ä��� �ȴ�.
		prop.put("name", "��ҿ�");
		prop.put("age", "30");
		prop.put("tel", "010-8888-8888");
		prop.put("addr", "����� �Ÿ���");
		
		// ���Ϸ� �����͸� ���� ��������.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day18/Pensoon.txt");
			// ���Ͽ� ������ �۾��� ������ ����Ѵ�.
			prop.store(fout, "*** ����� �������� ***");
			JOptionPane.showMessageDialog(null, "*** �������� �Ϸ� ***");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();
		
	}

}
