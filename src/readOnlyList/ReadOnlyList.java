package readOnlyList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadOnlyList {

	public static void main(String[] args) {
	List<String>fruitlist = new ArrayList<String>();
	fruitlist.add("Apple");
	fruitlist.add("Mango");
	fruitlist.add("Pineapple");
	List<String>unmodifiableList= Collections.unmodifiableList(fruitlist);
	unmodifiableList.add("NEW FRUIT");
	System.out.println(fruitlist);
	
	}

}
