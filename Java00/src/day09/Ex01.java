package day09;

import java.util.*;

/*
 	String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
 	
 	1. str ������ �� �������� �и��ؼ� �迭�� ��������.
 		String[] str1 = new String['.' ������ŭ];
 	
 	2. �ܾ� �� ��ŭ �迭�� �����, �迭�� �ܾ �Է��ϼ���.(toCharArray ���x)
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