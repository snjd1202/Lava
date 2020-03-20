package day10;

/*
 	 문제 1]

	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고,
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서 
	각 멤버를 초기화하고 
	출력하세요.
	 
 */
public class Ban {

	int ban;
	double dool;
	double nul;
	
	public void setVal(int no) {
		ban = no;
		
		// 넓이
		nul = ban * ban * 3.14;
		
		// 둘레
		dool = ban * 2 * 3.14;
	}
	
	//출력
	public void toPrint() {
		System.out.println("반지름 : "+ ban + " 넓이 : " +  nul + " 둘레 : " + dool+"\n--------------------------------");
	}
	

}
