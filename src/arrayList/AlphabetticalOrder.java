package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AlphabetticalOrder {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("seetha");
		names.add("sudhin");
		names.add("Swetha");
		names.add("Neethu");
		names.add("ananya");
		names.add("Athira");
		names.add("bala");
		names.add("Tony");
		names.add("Karthika");
		names.add("Nithin");
		names.add("Vinod");
		names.add("jeena");
		Collections.sort(names);
		for(int i=0; i<names.size(); i++)
		    System.out.println(names.get(i));
		 boolean y=names.contains(2);
		 if(y=true) {
			 System.out.println("It contains");
		 }else 
			 System.out.println("It doesn't contains");
	}

}
