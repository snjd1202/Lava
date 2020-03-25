package day13.sub;

import java.util.*;
public class Exec03 {
	
	public Exec03() {
		ArrayList list = new ArrayList();
		
		list.add(new Samgak());
		list.add(new Sagak());
		list.add(new Dongl());
		
		ArrayList list2 = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			int width = (int)(Math.random()*(10-5+1)+5);
			int height = (int)(Math.random()*(10-5+1)+5);
			list2.add(new int[] {width,height});
		}
		
		ArrayList mlist = new ArrayList();
		for(int i = 0; i < 10; i++) {
			int no = (int)(Math.random()*(3-1+1)+1);
			Moyang m = null;
			if(no == 1) {
				m = new Samgak(((int[])list2.get(i))[0], ((int[])list2.get(i))[1]);
			} else if(no == 2) {
				m = new Sagak(((int[])list2.get(i))[0], ((int[])list2.get(i))[1]);
			} else {
				m = new Dongl(((int[])list2.get(i))[0]);
			}
			mlist.add(m);
		}
		
		for(Object o : mlist) {
			Moyang m = (Moyang) o;
			m.toPrint();
		}
	}
	public static void main(String[] args) {
		new Exec03();
	}

}
