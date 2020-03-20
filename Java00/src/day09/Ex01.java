package day09;

import java.util.*;

/*
 	String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
 	
 	1. str 문장을 두 문장으로 분리해서 배열에 넣으세요.
 		String[] str1 = new String['.' 갯수만큼];
 	
 	2. 단어 수 만큼 배열을 만들고, 배열에 단어를 입력하세요.(toCharArray 사용x)
 */
public class Ex01 {
	String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
		public Ex01() {
		sol01();
		sol02();
		}	
		public void sol01() {
			
			int cnt1 = 0;
			String[] str1 = new String[cnt1];
			 
			for(int i = 0; i < str1.length; i++) {
					int ch = str.indexOf('.');
					
					str1[0] = str.substring(0,ch+1);
					str1[1] = str.substring(ch+i+1);
					
					System.out.println(str1[i]);
			}
			System.out.println();
		}
		
		
		public void sol02() {
			
			int cnt = 0;
			
			String[] arr = new String[cnt];
			// dkwlr 
			String tmp = str;
			for(int i = 0; i < cnt -1 ; i++ ) {
				
				int idx = tmp.indexOf(' ');
				
				arr[i] = tmp.substring(0, idx);
				tmp = str.substring(idx +1);
			}
			
			arr[cnt - 1] = tmp;
			System.out.println(Arrays.deepToString(arr));
		}
		
		
public static void main(String[] args) {
		new Ex01();
	}

}