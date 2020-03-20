package day10;

/*
	 문제 1]
	
	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고,
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서 
	각 멤버를 초기화하고 
	출력하세요.

*/
public class Ban_01 {
	Ban[] ban1;
	
	public void setBan() {
		ban1 = new Ban[10];
		
		for(int i = 0; i < ban1.length; i++) {
			ban1[i] = new Ban();
			
			int no = (int)(Math.random()*(33 - 29 + 1)+29);
			ban1[i].setVal(no);
		}
	}
	
	public static void main(String[] args) {
		Ban_01 b = new Ban_01();
		
		b.setBan();
		
		for(int i = 0; i < b.ban1.length; i++) {
			b.ban1[i].toPrint();
		}
		System.out.println();
	}

}
