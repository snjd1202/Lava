package day08;

import java.util.*;
import javax.swing.*;

/*
 	���� 1]
	�츮�� �л����� ������ �迭�� �����Ϸ��� �Ѵ�.
	�̸�, ��ȭ��ȣ, �̸����� �迭�� ���·� ����� �����ϰ�,
	�ٽ� ������ �����͸� �����ؼ� �迭�� �����,
	����ϼ���.
 */
public class Ex01 {

	public static void main(String[] args) {
		String[][][] arr = new String[2][5][3];
		String[][] people = {{"��ҿ�", "010-1111-1111","ksy@increpas.com"},
							{"�ֵο�", "010-2222-2222", "cdy@increpas.com"},
							{"�����", "010-3333-3333", "jys@increpas.com"},
							{"������", "010-5555-5555", "yth@increpas.com"},
							{"������", "010-6666-6666", "kjh@increpas.com"}};
		String[][] people1 = {{"�����", "010-1234-5678", "ksj@increpas.com"},
							{"������", "010-2345-6789", "sej@increpas.com"},
							{"����ö", "010-3456-7891", "lhc@increpas.com"},
							{"������", "010-4567-8910", "ljs@increpas.com"},
							{"�輺��", "010-5678-9101", "ksh@increpas.com"}};
		String[] name = {"��ҿ�", "�ֵο�", "�����", "������", "������"};
		String[] name1 = {"�����", "������", "����ö", "������", "�輺��"};
		
//		String[] name1 = {"��ҿ�", "�ֵο�", "�����", "������", "������"};
//		String[] tel1 = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-5555-5555", 
//						"010-6666-6666"};
//		String[] mail1 = new String[]{"ksy@increpas.com", "cdy@increpas.com","jys@increpas.com",
//									"yth@increpas.com","kjh@increpas.com"};
//		String[] name2 = {"�����", "������", "����ö", "������", "�輺��"};
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
