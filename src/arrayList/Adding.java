package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Adding {

	public static void main(String[] args) {
		 List<String>  li = new ArrayList<>();  
	      li.add("Hello");  
	      li.add("Everyone");       
	     Iterator<String> itr = li.listIterator();     
	      while(itr.hasNext()){
	          System.out.println(itr.next());  
	}

}
}
