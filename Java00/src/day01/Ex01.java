package day01;

public class Ex01 {
	/*
	 	1. 5, 10, 20�� ������ ���� �ϳ��� �����ϰ�(���, ���� ���)
		 	�� ���� 2������ �ٲ㺸�� 
		 	���� ���α׷��� ����� ��ġ�ϴ��� Ȯ���ϼ���.
		 	
		 	��Ʈ�ڵ� Ȯ�� ���
		 		Integer.toBinaryString(����);
------------------------------------------------------------------------------

		 2. �������� 7�� ���� ����, �ѷ��� ����ؼ� ����ϼ���.
		 		���� �ѷ��� 2 * ������ * 3.14
		 		���� ���̴� ������ * ������ * 3.14
		 		
		 		��, ������, �ѷ�, ���̴� ������ ���� ó���ϼ���.
		 		�׸��� �ѷ��� float Ÿ���� ������ ���弼��.
		 		
		 3. �� ���� ����(����)�� ������ ���
		  		�� ���� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
		  		
		  4. 3�� ������ �� ���� �غ��� ���̷� ������ �ﰢ���� ���̸� ���ϼ���.
		  
		  5. 54232���� ������ �ؾ��Ѵ�.
		 		�츮������ ȭ��� �� ������ ��� �ʿ����� ����ؼ� ����ϼ���.
		 		5������ - 1��
		 		1������ - 0��
		 		5õ���� - 0��
		 		1õ���� - 4��
		 		...
		 		
		 ����]
		 		1���� 365.2426���̴�.
		 		�� ��¥�� ���� �� ��, �� �ð�, �� ��, �� ������ ����ؼ� ����ϼ���. 
	 */
	public static void main(String[] args) {
		System.out.println("37 : " + Integer.toBinaryString(37));
		System.out.println("******************");
		// 17 = 10001
		// 37 = 100101
		
		// 2		
		int a = 7;
		double dool = (float)(2 * a * 3.14);
		double nulbi = (a * a * 3.14);
		
		System.out.println("�������� " + a + "�� ���� �ѷ� : " + dool );
		System.out.println("�������� "+ a + "�� ���� ���� : " + nulbi);
		System.out.println("******************");
		
		// 3
		int width = 5;
		int hight = 7;
		System.out.println("�簢���� ���̴� : " + width * hight);
		System.out.println("******************");
		
		// 4
		System.out.println("�ﰢ���� ���̴� : " + (width * hight) / 2);
		System.out.println("******************");
		
		// 5
		int no1 = 54232;
		int oman = 0;
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obak = 0;
		int bak = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		
		int temp = no1;
		oman = temp/50000;
		temp %= 50000;
		man = temp/10000;
		temp %= 10000;
		ochun = temp/5000;
		temp %= 5000;
		chun = temp/1000;
		temp %= 1000;
		obak = temp/500;
		temp %= 500;
		bak = temp/100;
		temp %= 100;
		osip = temp/50;
		temp %= 50;
		sip = temp/10;
		temp %= 10;
		il = temp/1;
		temp %= 1;
		
		System.out.println("5������ : " + oman + "��");
		System.out.println("1������ : " + man + "��");
		System.out.println("5õ���� : " + ochun + "��");
		System.out.println("1õ���� : " + chun + "��");
		System.out.println("5��� : " + obak + "��");
		System.out.println("1��� : " + bak + "��");
		System.out.println("5�ʿ� : " + osip + "��");
		System.out.println("1�ʿ� : " + sip + "��");
		System.out.println("1�� : " + il + "��");
		System.out.println("******************");
		
		
		/*	����]
		 		1���� 365.2426���̴�.
		 		�� ��¥�� ���� �� ��, �� �ð�, �� ��, �� ������ ����ؼ� ����ϼ���.*/
		double time = 365.2426;
		int sec = (int)((time % 1) * 24 * 60 * 60);
		
		int dd = (int)time;
		int hh = sec / 3600;
		sec %= 3600;
		int mm = sec / 60;
		sec %= 60;
		int ss = sec;
		
		System.out.println(dd + "��");
		System.out.println(hh + "�ð�");
		System.out.println(mm + "��");
		System.out.println(ss + "��");
		
	}
}
