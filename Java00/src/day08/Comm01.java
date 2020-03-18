package day08;

/*
 	comm 1]
	"Pengsoo good!"
	이라는 문자열을 한 문자씩꺼내서
	배열로 저장하고
	하나씩 꺼내서 출력하세요.

 */
import java.util.*;
import javax.swing.*;
public class Comm01 {

	public static void main(String[] args) {
		String str = "Pengsoo good!";
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);	
		}
		System.out.println(Arrays.toString(arr));

	}

}
