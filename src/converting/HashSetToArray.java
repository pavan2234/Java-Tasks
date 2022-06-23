package converting;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
	HashSet<String> set = new HashSet<String>();
	set.add("Pavan");
	set.add("file");
	set.add("Date");
	set.add("Time");
	System.out.println("The elements in hashset is "+set);
	String arr[] = new String[set.size()];
	int i=0;
    for(String ele:set){
      arr[i++] = ele;
    }
    for (String n : arr)
        System.out.println(n);
	}

}
