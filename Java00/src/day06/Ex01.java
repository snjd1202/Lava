package day06;

/*
	 문제 1]
		'A' ~ 'J' 까지의 문자를 순차적으로 만들어서 
		배열에 넣고, 각 문자를 하나씩 꺼내서 소문자로 변경하고,
		출력하세요.
		
		배열에 담긴 내용을 문자열로 확인해서 출력하세요.
 */
import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = new char[10];
		char ch1[] = new char[10];
		
		for(int i = 0; i < 10; i++) {
			ch[i] = (char)('A'+i);
			
		}
		for( int i = 0; i < 10; i++) {
			ch1[i] = (char)(('a'-'A') + (ch[i]));
		}
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(Arrays.toString(ch1));
	}

}
