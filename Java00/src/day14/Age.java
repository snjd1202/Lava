package day14;

/*
 		문제2]
	
	if - else if 구문을 사용해서
	
	나이를 입력하면 십대, 이십대,...
	판별해주는 프로그램을 작성하세요.
 */

/*
 	추가학습]
 	메인기능을 함수로 제작해서 처리하세요.
 */
import javax.swing.*;
public class Age {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("나이를 입력하세요.");
//		int age = Integer.parseInt(str);
		int age = 0;
		String msg = "";
		
		try {
			age = Integer.parseInt(str);
			if(age <= 9) {
				msg = "어린이 입니다.";
			} else if(age/10 == 1) {
				msg = "10대 입니다.";
			} else if(age/10 == 2){
				msg = "20대 입니다.";
			} else if(age/10 == 3) {
				msg = "30대 입니다.";
			} else if(age/10 == 4) {
				msg = "40대 입니다.";
			} else if(age/10 == 5) {
				msg = "50대 입니다.";
			} else if(age/10 == 6) {
				msg = "60대 입니다.";
			} else if(age/10 == 7) {
				msg = "70대 입니다.";
			} else if(age/10 == 8) {
				msg = "80대 입니다.";
			} else if(age/10 == 9) {
				msg = "90대 입니다.";
			} else {
				msg = "고령자 입니다.";
			} 		
	}	catch(Exception e) {
				msg = "나이형식이 아닙니다.";
			}
			JOptionPane.showMessageDialog(null, msg);
		}
	}


