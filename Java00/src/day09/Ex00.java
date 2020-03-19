package day09;

import java.util.*;
public class Ex00 {

	public static void main(String[] args) {
		char[][] ch = new char[][] {
			{'0','1','2','3','4','5','6','7','8','9'},
			{'A','B','C','D','E','F','G','H','I','J'},
//			{ },
//			{ },
			{'가','나','다','라','마','바','사','아','자','차'}
		};
//		for(int i = 0; i < ch.length; i++) {
//			for(int j = 0; j < i; j++) {
//				ch[0][j] = (char)(j+'1');
//				ch[1][j] = (char)(j+'A'); 
//			}
//			
//		}
		
		for(int i = 0; i < ch.length; i++) {
			for(int j = 0; j <ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		char[][] ch1 = new char[2][10];
		for(int i = 0; i < ch1.length; i++) {
			for(int j = 0; j<ch1[i].length; j++) {
				
				ch1[i][j] = ch[i][j];
				System.out.print(ch1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		char[][] ch2 = new char[2][10];
		for(int i = 0; i < ch2.length; i++) {
			for(int j = 0; j < ch2[i].length; j++) {
				
				int no = i;
				
				if(i == 1) {
					no = i + 1;
				}
				ch2[i][j] = ch[no][j];
				System.out.print(ch2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		char[][] ch3 = new char[10][3];
		for(int i = 0; i < ch3.length; i++) {
			for(int j = 0; j < ch3[i].length; j++){
				ch3[i][j] = ch[j][i];

				System.out.print(ch3[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		char[][] ch4 = new char[10][2];
		for(int i = 0; i < ch4.length; i++) {
			for(int j = 0; j < ch4[i].length; j++) {
				ch4[i][j] = ch[j][i];
				System.out.print(ch4[i][j]);
			}
			System.out.println();
				
		}
		System.out.println();
		
		char[][] ch5 = new char[10][2];
		for(int i = 0; i < ch5.length; i++) {
			for(int j = 0; j < ch5[i].length; j++) {
				int no = j;
				if(j == 1) {
					no = j + 1;
				}
				ch5[i][j] = ch[no][i];
				System.out.print(ch5[i][j]);
				}
			System.out.println();
		}
	}

}
 