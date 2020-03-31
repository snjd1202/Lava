package day17;

import java.util.*;
public class Semo02 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Semo sm1 = (Semo) o1;
		Semo sm2 = (Semo) o2;
		int result = (sm1.getWidth() - sm2.getWidth());
		
		return result;
	}



}
