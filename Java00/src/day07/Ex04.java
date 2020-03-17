package day07;

/*
 	문제 4]
	전화번호를 입력하면 
	'-' 를 기준으로 데이터를 분리해서
	저장할 배열을 만들고 분리된 데이터를 순서에 맞게 입력하고 출력하세요.
	indexOf()
	substring()
 */
import javax.swing.*;
import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("전화번호를 입력하세요.");
		String[] arr = new String[3];
		int ch = str.indexOf('-');
			arr[0] = str.substring(0,ch);
			String tmp = str.substring(ch + 1);
			ch = tmp.indexOf('-');
			arr[1] = tmp.substring(0,ch);
			arr[2] = tmp.substring(ch + 1);
			
		
//		String tmp = str.substring(ch+1);
//		ch = tmp.indexOf('-');
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = tmp.substring(0,ch); 
//			
//					
//					
//		}
		JOptionPane.showMessageDialog(null, arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
