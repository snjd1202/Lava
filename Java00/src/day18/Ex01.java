package day18;

import java.io.*;
import java.util.*;

import javax.swing.*;
/*
 	문제 1]
 		1. Ex01.txt 에 저장된 데이터를 Properties에 담고
 		2. 키값을 모두 꺼내서 
 		3. 데이터를 추출하고
 		4. 총점을 구해주세요.
 		5. 메세지창을 띄워서 총점을 출력해주세요.
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
		String msg1 = "*** 시험결과 ***";
		for(int i = 0; i < elist.size(); i++) {
			sum += Integer.parseInt(elist.get(i).getValue());
		}
		for(int i = 0; i < elist.size();i++) {
			msg1 += "\n" + elist.get(i).getKey() + " | " + elist.get(i).getValue();
		
	}
		msg1 += "\n총점 : " + sum;
		JOptionPane.showMessageDialog(null, msg1);
	
		
//-----------------------------------------------------------------------------------------
		Set<Map.Entry<Object, Object>> set1 = prop.entrySet(); 
		
		Iterator<Map.Entry<Object, Object>> itor = set1.iterator();
		int num=0;
		String msg = "*** 시험 결과 ***";
		while(itor.hasNext()) {
			Map.Entry<Object, Object> ent = itor.next();
			String y = (String)ent.getKey();
			String val = (String)ent.getValue();
			
			msg += "\n" + y + " : " + val;
//			JOptionPane.showMessageDialog(null, y + " : " + val);
			
			int no = Integer.parseInt(val);
			num += no;
						
		}
		
		msg += "\n총점 : " + num;
		JOptionPane.showMessageDialog(null, msg);
//		JOptionPane.showMessageDialog(null, "총점은 : " + num);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
