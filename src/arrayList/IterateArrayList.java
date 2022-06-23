package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args) {
	ArrayList<String>list=new ArrayList<String>();
	list.add("Pavan");
	list.add("laptop");
	list.add("Mouse");
	list.add("Keyboard");
	list.add(1,"new");
	Collections.sort(list);
	list.set(0,"replaced");
	ListIterator<String> itr = list.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	

	}
	

}
