package day08;

import java.util.Arrays;

/*
 	�������� �̸�, ��ȭ��ȣ, �̸����� ������ �迭��
 	������ �迭�� �����, �����͸� �Է��ϰ�,
 	����ϼ���.
 */
public class Test02 {

	public static void main(String[] args) {
		// ���� 2���� �迭�� �����. ���̴� 3, ������ �迭�� ���̴� 6���� �Ѵ�.
		String[][] samTeam = {{"��ҿ�", "�ֵο�", "�����", "������", "������", "�Ӽ���"},
								
								{"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-5555-5555",
									"010-6666-6666", "010-7777-7777"},
								
								{"ksy@increpas.com", "cdy@increpas.com","jys@increpas.com",
									"yth@increpas.com","kjh@increpas.com","lsj@increpas.com"}
							 };
//---------------------------------------------------------------------------------------------------		
		
		String[] name = {"��ҿ�", "�ֵο�", "�����", "������", "������", "�Ӽ���"};
		String[] tel = {"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-5555-5555", 
						"010-6666-6666", "010-7777-7777"};
		String[] mail = new String[]{"ksy@increpas.com", "cdy@increpas.com","jys@increpas.com",
									"yth@increpas.com","kjh@increpas.com","lsj@increpas.com"};
		
		String[][] team1 = new String[3][name.length];
		for(int i = 0; i < name.length; i++) {
			team1[0][i] = name[i];
			team1[1][i] = tel[i];
			team1[2][i] = mail[i];
		}
//----------------------------------------------------------------------------------------------------		
		String[][] teamOne = new String[3][];
		teamOne[0] = name;
		teamOne[1] = tel;
		teamOne[2] = mail;
		
		System.out.println(Arrays.deepToString(samTeam));
		System.out.println(Arrays.deepToString(team1));
		System.out.println(Arrays.deepToString(teamOne));
	}

}