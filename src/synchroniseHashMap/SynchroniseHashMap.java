package synchroniseHashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchroniseHashMap {

	public static void main(String[] args) {
	HashMap<String,String> map = new HashMap<String,String>();
	map.put("A", "a");
	map.put("B", "b");
	map.put("C", "c");
	map.put("D", "d");
	map.put("E", "e");
	Map<String, String> newmap = Collections.synchronizedMap(map);
	Set set = newmap.entrySet();
	synchronized(newmap) {
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry pair = (Map.Entry)i.next();
			System.out.print(pair.getKey()+":");
			System.out.println(pair.getValue());
		}
	}
	}

}
