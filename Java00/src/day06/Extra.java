package day06;
/*
	 	extra]
	 	1, 1,...
	 	로 시작하는 피보나치 수열을 10개 출력하세요.
	 	
	 	참고]
	 		피보나치 수열:
	 			앞의 두 수를 더한 값들의 집합...
	 			1,1,2,3,5,...
 */
public class Extra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jak = 1;
		int kn = 1;
		System.out.print(jak + ", " + kn +", ");
		for(int i = 0; i < 8; i++) {
			int result = jak + kn;
			jak = kn;
			kn = result;
			System.out.print(kn + ", ");
			
		}
	}

}
