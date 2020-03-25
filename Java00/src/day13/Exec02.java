package day13;

import java.util.*;
public class Exec02 {

	public Exec02() {
		ArrayList list = new ArrayList();
		
		list.add(new Nemo());
		list.add(new Semo());
		list.add(new Won());
		
		ArrayList list2 = new ArrayList();
		
		for(int i = 0 ; i < 10 ; i++ ) {
			int width = (int)(Math.random() * (20 - 10 + 1)+10);
			int height = (int)(Math.random() * (20 - 10 + 1)+10);
			list2.add(new int[] {width, height});
		}
		
		// Figure ���� ����Ʈ
		ArrayList flist = new ArrayList();
		for(int i = 0 ; i < 10 ; i++ ) {
			// �Ź� �����ϰ� ���� ������ ������ ������.
			int no = (int)(Math.random()*3 + 1);
			Figure f = null;
			if(no == 1) {
				// �簢�� �־��ְ�
				f = new Nemo();
			} else if( no == 2) {
				// �ﰢ�� �־��ְ�
				f = new Semo();
			} else {
				// �� �־��ְ�...
				f = new Won();
			}
			f.calcArea((int[])list2.get(i));
			flist.add(f);
		}
		
		for(Object o : flist) {
			Figure f = (Figure) o;
			f.toPrint();
		}
		
	}
	public static void main(String[] args) {
		new Exec02();
		
	}

}
