package day07;
import java.util.Arrays;

/*
	문제 7]
문자열을 입력받아서 
문자배열에 문자열을 이루는 문자를 순차적으로 저장하세요.

참고]
	문자열의 특정위치의 문자를 추출해주는 함수
	
	문자열.charAt(위치값);
	
	문자열의 길이를 반환해주는 함수
	
		문자열.length(); 
	
	반환값이 정수
*/
import javax.swing.*;
public class Solv07_day06 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("문자열을 아무거나 넣어주세요. : ");
		// 문자열 뒤집는 문자배열
		char[] ch1 = new char[str.length()];

		char[] ch = new char[str.length()];
		// 문자열의 길이만큼 반복해서
		// 문자를 꺼내고
		// 꺼낸 문자를 위의 문자 배열에 차곡차곡 넣어준다.
		for(int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			ch1[i] = str.charAt(str.length() - 1 - i);
		}
//		System.out.println("문자열 : " + str);
//		System.out.println("ch : " + Arrays.toString(ch));
//		System.out.println("ch1 : " + Arrays.toString(ch1));
		String msg = "문자열 : " + str + 
					"\nch : " + Arrays.toString(ch) + 
					"\nch1 : " + Arrays.toString(ch1);
		JOptionPane.showConfirmDialog(null, msg);
	}

}
