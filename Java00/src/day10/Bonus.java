package day10;

import java.util.Arrays;

/*
 	보너스
	
	최근 5년동안의 기온을 배열에 담아서 관리하려고 한다.
	int[][] gion = new int[5][2];
	
	로 만들고
	첫 번째 방에는 기온을 -20 ~ 40 까지 랜덤하게 입력하고
	두 번째 방에는 순위를 1 ~ 5까지 인덱스 증가값으로 채워넣으세요.
 */
public class Bonus {

	public static void main(String[] args) {
		int[][] gion = new int[5][2];
		
		for(int i = 0; i < gion.length;i++) {
			for(int j = 0; j < gion[i].length; j++) {
				int ondo = (int)(Math.random()*(40+20+1)-20);
				gion[i][0] = ondo;
				gion[i][j] = i+1;
			}
			
		}
		System.out.println(Arrays.deepToString(gion));
		System.out.println();

		for(int[] g: gion) {
			System.out.println(Arrays.toString(g));
		}
			System.out.println();
		for(int i = 0; i < gion.length - 1; i++) {
			for(int j = 0; j < gion.length; j++) {
				if(gion[i][0] > gion[j][0]) {
					int[] tmp = gion[i];
					gion[i] = gion[j];
					gion[j] = tmp;
				}
			}
		}
		for(int i = 0; i < gion.length; i++) {
			gion[i][1] = i +1;
		}
		for(int[] g: gion) {
			System.out.println(Arrays.toString(g));
		}
		
	}
}
