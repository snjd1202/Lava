package day09;

import java.util.*;

/*
 	String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
 	
 	1. str 문장을 두 문장으로 분리해서 배열에 넣으세요.
 		String[] str1 = new String['.' 갯수만큼];
 	
 	2. 단어 수 만큼 배열을 만들고, 배열에 단어를 입력하세요.(toCharArray 사용x)
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