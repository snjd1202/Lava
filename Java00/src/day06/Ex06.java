package day06;

/*
 	문제 6]
	팩토리얼 10개를 저장할 배열을 만들고,
	1부터 순차적으로 10까지의 팩토리얼을 만들어서 배열에 담고
	꺼내서 출력하세요.
 */
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr[] = new long[10];
		long no = 1;
		
		for(int i = 0; i < 10; i++) {
			long result = no * (i+1);
			no = result;
			
			arr[i] = result;
			System.out.println(arr[i]);
		}
	}
}
