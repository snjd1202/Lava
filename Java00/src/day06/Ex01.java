package day06;

/*
	 ���� 1]
		'A' ~ 'J' ������ ���ڸ� ���������� ���� 
		�迭�� �ְ�, �� ���ڸ� �ϳ��� ������ �ҹ��ڷ� �����ϰ�,
		����ϼ���.
		
		�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ����ϼ���.
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
