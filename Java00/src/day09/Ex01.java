package day09;

import java.util.*;

/*
 	String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
 	
 	1. str ������ �� �������� �и��ؼ� �迭�� ��������.
 		String[] str1 = new String['.' ������ŭ];
 	
 	2. �ܾ� �� ��ŭ �迭�� �����, �迭�� �ܾ �Է��ϼ���.(toCharArray ���x)
 */
public class Ex01 {
		public Ex01() {
		sol01();
		sol02();
		}	
		public void sol01() {
			String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
			String[] str1 = new String[2];
			
			for(int i = 0; i < str1.length; i++) {
					int ch = str.indexOf('.');
					
					str1[0] = str.substring(0,ch+1);
					str1[1] = str.substring(ch+i+1);
					
					System.out.println(str1[i]);
			}
			System.out.println();
		}
		
		
		public void sol02() {
			String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
			
			int cnt = 0;
		}
		
		
public static void main(String[] args) {
		new Ex01();
	}

}