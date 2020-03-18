package day08;

import java.util.*;
import javax.swing.*;
/*
 	���� 0]
	�������� ����ϴµ�
	�ܰ� ���� �迭�� ���� ó���ϰ� ����ϼ���
	-----------------------
	|��			|		��|
	-----------------------
	int[] dan = {2,3, ... , 9};
	int[] gop = {1,2,3, ... , 9};
	-- �ʱ�ȭ�� �ݺ�������

	int[][] gugudan = {dan, gop};
	
	������´�
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
