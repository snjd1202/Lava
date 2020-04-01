package day18;

import java.io.*;
import java.util.*;
public class Test02 {

	public Test02() {
		Properties prop = new Properties();
		
		//������ ���� �غ��ϰ�
		FileInputStream fin = null;
		
		//���� �а�
		try {
			fin = new FileInputStream("src/day18/Sample2.properties");
			
			//porp�� ���ϳ��� �ε��ϰ�
			prop.load(fin);
		} catch(Exception e) {
			
		}
		System.out.println("���� ��    �� : " + prop.get("name"));
		System.out.println("���� ��    �� : " + prop.get("age"));
		System.out.println("���� ��ȭ��ȣ : " + prop.get("tel"));
		System.out.println("���� ��    �� : " + prop.get("addr"));
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
