package day08;

import java.util.*;
import javax.swing.*;

/*
 	문제 1]
	우리반 학생들의 정보를 배열로 관리하려고 한다.
	이름, 전화번호, 이메일을 배열의 형태로 만들어 관리하고,
	다시 팀별로 데이터를 정리해서 배열을 만들고,
	출력하세요.
 */
public class Ex01 {

	public static void main(String[] args) {
		String[][][] arr = new String[2][5][3];
		String[][] people = {{"김소영", "010-1111-1111","ksy@increpas.com"},
							{"최두용", "010-2222-2222", "cdy@increpas.com"},
							{"정우승", "010-3333-3333", "jys@increpas.com"},
							{"유태희", "010-5555-5555", "yth@increpas.com"},
							{"김종형", "010-6666-6666", "kjh@increpas.com"}};
		String[][] people1 = {{"김수진", "010-1234-5678", "ksj@increpas.com"},
							{"손은진", "010-2345-6789", "sej@increpas.com"},
							{"이한철", "010-3456-7891", "lhc@increpas.com"},
							{"이진수", "010-4567-8910", "ljs@increpas.com"},
							{"김성현", "010-5678-9101", "ksh@increpas.com"}};
		String[] name = {"김소영", "최두용", "정우승", "유태희", "김종형"};
		String[] name1 = {"김수진", "손은진", "이한철", "이진수", "김성현"};
		
//		String[] name1 = {"김소영", "최두용", "정우승", "유태희", "김종형"};
//		String[] tel1 = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-5555-5555", 
//						"010-6666-6666"};
//		String[] mail1 = new String[]{"ksy@increpas.com", "cdy@increpas.com","jys@increpas.com",
//									"yth@increpas.com","kjh@increpas.com"};
//		String[] name2 = {"김수진", "손은진", "이한철", "이진수", "김성현"};
//		String[] tel2 = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
//		String[] mail2 = {"ksj@increpas.com","sej@increpas.com","lhc@increpas.com","ljs@increpas.com",
//						"ksh@increpas.com"};
		
//		 for(int i = 0; i < arr.length; i++) {
//			 for(int j = 0; j < arr[i].length; j++) {
//				 for(int k = 0; k < arr[j].length; k++) {
//					 arr[i][j][k] = {name1[k] + tel1[k] + mail[k]}; 
//				 }
//			 }
//		 }
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < name[i].length(); j++) {
				for(int k = 0; k < name[i].length(); k++) {
//					arr[0][0][i] = people[i]; 
					
				}
			}
//			arr[0][i][0] = name[i];
			
		}
	}

}
