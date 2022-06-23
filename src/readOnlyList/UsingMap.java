package readOnlyList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UsingMap {

	public static void main(String[] args) {
		Map<String,Integer>storelist = new HashMap<String,Integer>();
		storelist.put("ZOMATO",789);
		storelist.put("ZOMAT",7894);
		storelist.put("ZOMA",78945);
		storelist.put("ZOM",789456);
		System.out.println(storelist);
	storelist  = Collections.unmodifiableMap(storelist);
	storelist.put("Myself", 970);

	}

}
