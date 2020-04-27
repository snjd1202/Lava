package exam1;

import java.util.*;

public class Ex11 {

	public Ex11() {
		HashMap<String,String> map = new HashMap();
		map.put("이름", "홍길동");
		map.put("나이", "24");
		map.put("성별", "남자");
		
		Set<String> key = map.keySet();
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> itor = set.iterator();
		
		while(itor.hasNext()) {
			Map.Entry<String, String> ent = itor.next();
			String k = ent.getKey();
			String val = ent.getValue();
			
			System.out.println(k + " - " + val);
		}
	}

	public static void main(String[] args) {
		new Ex11();
	}

}
