package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("e");
	list.add("f");
	Collections.reverse(list);
	System.out.println(list);

	}

}
