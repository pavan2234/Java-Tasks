package arrayList;

import java.io.*;
import java.util.*;

public class SerializeArrayList {

	public static void main(String[] args) throws IOException {
	List<String> list = new ArrayList<String>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	FileOutputStream fos = new FileOutputStream("D:\\FileHandling\\synchronisearay.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(list);
	oos.close();
	fos.close();
	}

}
