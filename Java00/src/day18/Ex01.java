package day18;

import java.io.*;
import java.util.*;

import javax.swing.*;
/*
 	���� 1]
 		1. Ex01.txt �� ����� �����͸� Properties�� ���
 		2. Ű���� ��� ������ 
 		3. �����͸� �����ϰ�
 		4. ������ �����ּ���.
 		5. �޼���â�� ����� ������ ������ּ���.
 */
public class Ex01 {

	public Ex01() {
		Properties prop = new Properties();
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		} catch(Exception e) {
			e.printStackTrace();
		}
		Set set = prop.keySet();
		
		ArrayList<Map.Entry<String, String>> elist = new ArrayList<Map.Entry<String,String>>(set);
		int sum = 0;
		String msg1 = "*** ������ ***";
		for(int i = 0; i < elist.size(); i++) {
			sum += Integer.parseInt(elist.get(i).getValue());
		}
		for(int i = 0; i < elist.size();i++) {
			msg1 += "\n" + elist.get(i).getKey() + " | " + elist.get(i).getValue();
		
	}
		msg1 += "\n���� : " + sum;
		JOptionPane.showMessageDialog(null, msg1);
	
		
//-----------------------------------------------------------------------------------------
		Set<Map.Entry<Object, Object>> set1 = prop.entrySet(); 
		
		Iterator<Map.Entry<Object, Object>> itor = set1.iterator();
		int num=0;
		String msg = "*** ���� ��� ***";
		while(itor.hasNext()) {
			Map.Entry<Object, Object> ent = itor.next();
			String y = (String)ent.getKey();
			String val = (String)ent.getValue();
			
			msg += "\n" + y + " : " + val;
//			JOptionPane.showMessageDialog(null, y + " : " + val);
			
			int no = Integer.parseInt(val);
			num += no;
						
		}
		
		msg += "\n���� : " + num;
		JOptionPane.showMessageDialog(null, msg);
//		JOptionPane.showMessageDialog(null, "������ : " + num);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
