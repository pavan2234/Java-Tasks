package HashMapPassOrFail;

import java.util.HashMap;
import java.util.Map.Entry;

public class PassOrFail {

	public static void main(String[] args) {
		HashMap<String,Float> map = new HashMap<String,Float>();
		map.put("selva",75.6f);
		map.put("abi",89.5f);
		map.put("ram",40.2f);
		 for (Entry<String, Float> m : map.entrySet()) {
		     System.out.println(m.getKey() + " " + m.getValue());
		 }
		 for (Entry<String, Float> m : map.entrySet()) {
	     if(m.getValue()>60) {
	    	 System.out.println(m.getKey() + " " + "pass");	 
	     }else {
	    	 System.out.println(m.getKey() + " " + "fail");
	     }
	}

}
}
