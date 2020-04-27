package day19;

/*
 	���Ͽ�
 		ģ���� ������ �����Ѵ�.
 		
 		����
 			�̸�	String
 			����	int
 			����	float
 			����	char
 			��ȭ	String
 			����	String
 			
 	��ó�� �ڹ��� ������ Ÿ���� �״�� ���� �� �ִ� ��Ʈ����
 	DataInputStream / DataOutputStream
 	���ǻ����� �Է¼��� �°� �״�� ������ �ǰ�
 	���� ���� DataOutputStream���θ� ������ �Ѵ�.
 	
 	�̴�.
 			
 */
import java.io.*;
import javax.swing.*;
public class Test08 {
 
	public Test08() {
		// �ʿ��� ��Ʈ���� �غ��Ѵ�.
		// Ÿ�� ��Ʈ�� �غ�
		// ���Ͽ� ������ ���̹Ƿ�
		FileOutputStream fout = null;
		//���ͽ�Ʈ�� �غ� <== �ڹ��� ������Ÿ���� ����ؾ��Ѵ�.
		DataOutputStream dout = null;
		
		try {
			// ��Ʈ�� �ʱ�ȭ�ϰ�
			fout = new FileOutputStream("src/day19/etc/DataStream_test.txt");
			dout = new DataOutputStream(fout);
			// ������ �����͸� �غ��Ѵ�.
			String name = "����";
			int age = 29;
			float height = 90.0f;
			char gen = 'M';
			String tel = "010-1111-1111";
			String mail = "choppa@increpas.com";
			
			// DataInputStream / DataOutputStream �� Ư¡�� �ڹ��� �����͸� ��ȯ���� ����� �� �ִ�.
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeFloat(height);
			dout.writeChar(gen);
			dout.writeUTF(tel);
			dout.writeUTF(mail);
			
			JOptionPane.showMessageDialog(null, "*** ģ�� ��� �Ϸ� ***");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				dout.close();
				fout.close();
			}catch(Exception e) {}
		}
		
	}
	public static void main(String[] args) {
		new Test08();
	}
}