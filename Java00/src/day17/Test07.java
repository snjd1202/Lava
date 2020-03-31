package day17;

import java.util.*;
public class Test07 {

	/*
	 	����]
	 		������ ���ڸ� 10�� �߻��ϰ�
	 		�� ���ڸ� �л��� �����̶�� �����Ѵ�.
	 		�� �߿� 80~100 ������ ������ ���� �̾Ƽ� �����ϰ��� �Ѵ�.
	 		��, �ߺ� ������ ���� ������ �Ѵ�.
	 */
	public Test07() {
		// TreeSet�� �����
		TreeSet<Integer> set = new TreeSet<Integer>();
		Random rnd = new Random();
		
		// �����ϰ� ���� 10�� �Է��ϰ�
		while(true) {
			set.add(rnd.nextInt(101));
			if(set.size() == 20) break;
		}
		
		// 80 ~ 100 ������ ���� ���� �̾Ƽ� �����ϰ�
		TreeSet<Integer> tScore = (TreeSet<Integer>)set.subSet(80, 100);	
		// subSet() �� ��ȯ�� Ÿ���� SortedSet �̹Ƿ� ��������ȯ ���ش�.
		
		// ArrayList�� ��ȯ�ؼ� �������.
		ArrayList<Integer> list = new ArrayList<Integer>(tScore);
		
		for(int s : list) {
			System.out.print(s + " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test07();
	}

}
