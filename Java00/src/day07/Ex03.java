package day07;

/*
 	문제 3]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고, - 문자열 배열 3개
	데이터를 입력해놓고
	이름을 입력하면 
	그 사람의 데이터를 모두 저장할 배열을 만들어서
	데이터를 넣고 출력하세요.
 */
import javax.swing.*;
import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		String[] name = {"김수진", "손은진", "이한철", "이진수", "김성현"};
		String[] tel = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		String[] mail = {"ksj@increpas.com","sej@increpas.com","lhc@increpas.com","ljs@increpas.com","ksh@increpas.com"};
		String str = JOptionPane.showInputDialog("이름을 입력하세요. : ");
		int idx = -1;
		for(int i = 0; i < name.length; i++) {
			String[] info = new String[] {name[i],tel[i],mail[i]};
			if(name[i].equals(str)) {
				idx = i;
				JOptionPane.showMessageDialog(null,info);
				System.out.println(Arrays.toString(info));
		}
			
			
//		for(int j = 0; j < name.length; j++) {
//			if(name[i].equals(str)) {
//				info[i] = name[i];
//				info[i+1] = tel[i];
//				info[i+2] = mail[i];
//				}			
//			}
		}
	}
}

