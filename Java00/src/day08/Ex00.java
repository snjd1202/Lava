package day08;

import java.util.*;
import javax.swing.*;
/*
 	문제 0]
	구구단을 출력하는데
	단과 곱을 배열을 만들어서 처리하고 출력하세요
	-----------------------
	|단			|		곱|
	-----------------------
	int[] dan = {2,3, ... , 9};
	int[] gop = {1,2,3, ... , 9};
	-- 초기화는 반복문으로

	int[][] gugudan = {dan, gop};
	
	출력형태는
		2 x 1 = 2
		...
		2 x 9 = 18
		----------
		3 x 1 = 3
		...
 */
public class Ex00 {

	public static void main(String[] args) {
		
		int[] dan = new int[8];
		int[] gop = new int[9];
		int[][] gugudan = {dan,gop};
		
			for(int i = 0; i < 8; i++) {
					dan[i] = i+2;
			}
			for(int j = 0; j < 9; j++) {
				gop[j] = j+1;
			}					
			for(int i = 0; i < gugudan[0].length; i++) {
				for(int j = 0; j < gugudan[1].length; j++) {
					System.out.println(gugudan[0][i] +" x "+ gugudan[1][j] + " = " + (gugudan[0][i] *  gugudan[1][j]));
				}
				System.out.println("----------");
			}

//		System.out.println(Arrays.deepToString(gugudan));
		
	}

}
