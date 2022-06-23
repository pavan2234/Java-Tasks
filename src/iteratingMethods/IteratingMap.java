package iteratingMethods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMap {

	public static void main(String[] args) {
	Map<String,String>countries = new HashMap<String,String>();
	countries.put("India","Delhi");
	countries.put("UnitedStates","WashingtonDC");
	countries.put("China","HongKong");
	countries.put("Japan","Tokyo");
	System.out.println(countries);
	for(Map.Entry<String,String> entry : countries.entrySet())
        System.out.println(entry.getKey()+"-----"+entry.getValue());
                        
	 countries.forEach((k,v) -> System.out.println("Key = "
             + k + ", Value = " + v));
	 
	 for(String country:countries.keySet()) {
		 System.out.println(country);
	 }
	 for(String capital:countries.values()) {
		 System.out.println(capital);
	 }
	 Iterator<Map.Entry<String,String>> itr = countries.entrySet().iterator();
	 
	 while (itr.hasNext()) {
	     System.out.println(itr.next());
	 }
	}

}