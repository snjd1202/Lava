package day16_hw;

/*
	Calendar Ŭ������
		1. set()
			��� ����(��,��,��,�ð�,��,��)
				set(int year, int month, int date, int hourOfDay, int minute, int second)
				
		2. getTimeInMillis()
			milliseconds�� ��������
				setTimeInMillis(long millis)
			
		3. getActualMaximum()
			Ķ���� �ʵ忡�� ��ȯ�� �� �ִ� ���� ū ���� ��ȯ
				getActualMaximum(int field)
			
		4. add()
			Ķ���� �ʵ��� ������ ���� �������
				add(int field, int amount)
			
		5. roll()
			�ʵ��� ��ȭ ���� ������ Ķ���� �ʵ��� ���� �������
				roll(int field, int amount)
			
		6. after()
			������Ʈ�� ������ �ð� ���� �ð��� �´���
				after(Object when)
			
		7. before()
			������Ʈ�� ������ �ð� ���� �ð��� �´���
				before(Object when)
		
	�� �ǹ̿� ������ �����ϼ���.
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
		System.out.println("4. add() : " + day + " ��");
		
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
