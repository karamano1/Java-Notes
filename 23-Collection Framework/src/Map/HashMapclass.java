package Map;

import java.util.*;

public class HashMapclass {

	public static void main(String[] args) {
		//Map map = new HashMap();
		Map<String,String>map = new HashMap<>();
		map.put("MyName", "Mike");
		map.put("MyJob", "Developer");
		map.put("MyAge", "25");
		map.put("x", "y");
		System.out.println(map);
		System.out.println(map.get("MyName"));
		Set<String> keys =map.keySet();
		for(String key:keys) {
			System.out.println(key + "  " + map.get(key));
		}
	}

}
