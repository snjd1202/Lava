package day15;

import java.util.regex.*;

import javax.swing.*;

/*
 	문제 1]
 	
 		이메일을 입력받아서
 		입력받은 문자열이 이메일 형식에 맞는지 아닌지 검사하세요.
 		이메일 형식은
 			알파벳과 숫자로 8글자 이상으로 하고 @ 도메인주소
 		로 처리하세요.
 			
 		참고]
 			한글 처리 : [가-힣] 
 		
 */
public class Ex01 {
	public Ex01(){
		// 전화번호 입력받기
		String mail = JOptionPane.showInputDialog("이메일을 입력하세요.");
		// 패턴 만들기
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}@[a-zA-Z0-9].*");
		Matcher match = pattern.matcher(mail);
		// 검사결과
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "올바른 이메일 형식입니다.");
		} else {
			JOptionPane.showMessageDialog(null, "올바르지 않은 이메일 형식입니다.");			
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
