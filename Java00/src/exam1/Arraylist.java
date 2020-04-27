package exam1;

import java.util.*;
public class Arraylist {

	public Arraylist() {
		ArrayList<String> list = new ArrayList<String>();
		
		String name[] = {"박태환","김연아","손연재"};
		
		for(int i=0; i < name.length; i++) {
			String str = name[i];
			list.add(new String(str));
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		new Arraylist();
		
	}

}
