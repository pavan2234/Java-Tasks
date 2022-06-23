package readOnlyList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UsingSet {

	public static void main(String[] args) {
		Set<String>mylist = new HashSet<String>();
		mylist.add("Pavan");
		mylist.add("Nym");
		mylist = Collections.unmodifiableSet(mylist);
		mylist.add("POIN");

	}

}
