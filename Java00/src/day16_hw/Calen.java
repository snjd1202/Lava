package day16_hw;

/*
	Calendar 클래스의
		1. set()
			밸류 세팅(년,월,일,시간,분,초)
				set(int year, int month, int date, int hourOfDay, int minute, int second)
				
		2. getTimeInMillis()
			milliseconds를 리턴해줌
				setTimeInMillis(long millis)
			
		3. getActualMaximum()
			캘린더 필드에서 반환할 수 있는 가장 큰 값을 반환
				getActualMaximum(int field)
			
		4. add()
			캘린더 필드의 지정된 날의 증감계산
				add(int field, int amount)
			
		5. roll()
			필드의 변화 없이 지정된 캘린더 필드의 양을 증감계산
				roll(int field, int amount)
			
		6. after()
			오브젝트에 지정된 시간 이후 시간이 맞는지
				after(Object when)
			
		7. before()
			오브젝트에 지정된 시간 이전 시간이 맞는지
				before(Object when)
		
	를 의미와 사용법을 공부하세요.
 */
import java.util.*;
public class Calen {
	public Calen() {
		Calendar cal = Calendar.getInstance();
		// 1. set()
		cal.set(Calendar.YEAR,1994);
		cal.set(Calendar.MONTH,Calendar.DECEMBER);
		cal.set(Calendar.DATE,02);
		
		System.out.print("year : " + (cal.get(Calendar.YEAR)));
		System.out.print(" month : " + (cal.get(Calendar.MONTH)+1));
		System.out.print(" date : " + cal.get(Calendar.DATE));
		System.out.println();
		
		// 3. getActualMaximum(int field)
		System.out.println("3. getActualMaximum() : " + cal.getActualMaximum(Calendar.DATE));
		
		// 4. add(int field, int amount)
		cal.add(cal.DATE, 3);
		int day = cal.get(cal.DATE);
		System.out.println("4. add() : " + day + " 일");
		
		// 5. roll(int field, int amount)
		cal.roll(cal.YEAR,27);
		int yr = cal.get(cal.YEAR);
		System.out.println("5. roll() : " + yr);
		
		// 6. after(Object when)
//		int yr2 = Integer.parseInt((cal.set(cal.YEAR,1994)));
//		int yr2 = cal.get(cal.YEAR);
//		int yr3 = cal.
//		System.out.println(cal.after(yr.2025));
	}

	public static void main(String[] args) {
		new Calen();
		
	}

}
