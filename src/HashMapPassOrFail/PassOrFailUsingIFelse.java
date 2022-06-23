package HashMapPassOrFail;

import java.util.HashMap;
import java.util.Map.Entry;

public class PassOrFailUsingIFelse {

	public static void main(String[] args) {
		HashMap<String,Float> map = new HashMap<String,Float>();
		map.put("selva",75.6f);
		map.put("abi",89.5f);
		map.put("ram",40.2f);
		for (Entry<String, Float> m : map.entrySet()) {
	    System.out.println(m.getKey() + " " + m.getValue());
		}
	    if(map.get("selva")>=60) {
	    	System.out.println("selva:pass");
	    }else {System.out.println("selva:fail");
	}
	    if(map.get("abi")>=60) {
	    	System.out.println("abi:pass");
	    }else {System.out.println("abi:fail");
	}
	    if(map.get("ram")>=60) {
	    	System.out.println("ram:pass");
	    }else {System.out.println("ram:fail");
	}

}
}

