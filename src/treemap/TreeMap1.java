package treemap;

import java.util.*;

public class TreeMap1 {

	public static void main(String[] args) {
	TreeMap<Integer,String> list = new TreeMap<Integer,String>();
	list.put(1,"Pavan");
	list.put(2,"Surya");
	list.put(3, "Charan");
	for (Map.Entry<Integer, String>entry : list.entrySet())
System.out.println("[" + entry.getKey()+ ", " + entry.getValue() + "]");	
}
}


