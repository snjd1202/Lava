package day19;


/*
 	Test11.java ������ �о��.
 */
import java.io.*;
import javax.swing.*;
public class Test12 {

	public Test12() {
		// Ÿ�ٽ�Ʈ�� �غ��ϰ�
		FileReader fr = null;
		// ���ͽ�Ʈħ �غ��ϰ� 
		BufferedReader br = null;
		
		try {
			// ��Ʈ�� �ʱ�ȭ�ϰ�
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			// ����� �о�� ���� �𸣹Ƿ� �ݺ��ؼ� ó���Ѵ�.
			String msg = "";
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				str += "\n";
				msg += str;
			}
			
			// ���� ���� ����ϰ�
			JOptionPane.showMessageDialog(null, msg);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
