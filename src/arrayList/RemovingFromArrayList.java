package arrayList;

import java.util.ArrayList;

public class RemovingFromArrayList {

	public static void main(String[] args) {
		ArrayList<String>list1=new ArrayList<String>();
		list1.add("pavan");
		list1.add("laptop");
		list1.add("mouse");
		list1.add("keyboard");
		list1.remove(2);
		System.out.println(list1);
		for(int i=0;i<list1.size();i++)
		System.out.println(list1.get(i));
	}

}
