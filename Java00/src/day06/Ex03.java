package day06;

/*
 	문제 3]
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	이라는 배열을 준비하고, 
	79456원을 준비된 화폐단위로 계산할 때 각각의 화폐단위가 몇 개씩 필요한지
	갯수를 저장할 배열을 만들고, 출력하는 프로그램을 작성하세요.
 */
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] no = new int[8];
		int mn = 79456;
		
		for(int i = 0; i < 8; i++) {
			no[i] = mn / coin[i];
			mn = mn % coin[i];
				System.out.println(coin[i] +" : "+ no[i]);
			}

			
		}

	}
