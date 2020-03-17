package day06;

/*
 	문제 8]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고, - 문자열 배열 3개
	데이터를 입력해서 
	
	회원의 이름을 입력하면
	회원의 이름과 전화번호, 이메일을 출력해주는 프로그램을 작성하세요.
	
 */
import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		String arr1[] = {"김수진", "손은진", "이한철", "이진수", "김성현"};
		String arr2[] = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		String arr3[] = {"ksj@increpas.com","sej@increpas.com","lhc@increpas.com","ljs@increpas.com","ksh@increpas.com"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요. : ");
		String str = sc.nextLine();
		
		int idx = 99;
		for(int i = 0 ; i < arr1.length ; i++ ) {
			if(arr1[i].equals(str)) {
				idx = i;
			}
		}
		System.out.println("이름 : " + arr1[idx]);
		System.out.println("전화번호 : " + arr2[idx]);
		System.out.println("이메일 : " + arr3[idx]);
		
		
		
		for(int i= 0; i < arr1.length; i++) {
				if(str.equals(arr1[i])) {
					System.out.println("이름 : " + arr1[i]);
					System.out.println("전화번호 : " + arr2[i]);
					System.out.println("이메일 : " + arr3[i]);
			}
			System.out.println();
		}
		

	}

}
