package arrayList;
import java.util.*;
public class SynchronizeArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	synchronized(list) {
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}

	}

}
