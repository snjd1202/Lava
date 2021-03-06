package day08;

import java.util.Arrays;

/*
 	팀원들의 이름, 전화번호, 이메일을 관리할 배열을
 	관리할 배열을 만들고, 데이터를 입력하고,
 	출력하세요.
 */
public class Test02 {

	public static void main(String[] args) {
		// 먼저 2차원 배열을 만든다. 길이는 3, 내부의 배열의 길이는 6으로 한다.
		String[][] samTeam = {{"김소영", "최두용", "정우승", "유태희", "김종형", "임서진"},
								
								{"010-1111-1111", "010-2222-2222", "010-3333-3333", "010-5555-5555",
									"010-6666-6666", "010-7777-7777"},
								
								{"ksy@increpas.com", "cdy@increpas.com","jys@increpas.com",
									"yth@increpas.com","kjh@increpas.com","lsj@increpas.com"}
							 };
//---------------------------------------------------------------------------------------------------		
		
		String[] name = {"김소영", "최두용", "정우승", "유태희", "김종형", "임서진"};
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
