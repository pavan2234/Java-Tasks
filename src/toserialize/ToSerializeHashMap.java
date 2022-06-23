package toserialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ToSerializeHashMap {

	public static void main(String[] args) {
	HashMap<String,String> map = new HashMap<>();
	map.put("A", "a");
	map.put("B", "b");
	map.put("C", "c");
	map.put("D", "d");
	map.put("E", "e");
	try {
		FileOutputStream fos = new FileOutputStream("D:\\FileHandling\\newHashmap1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(map);
		fos.close();
		oos.close();
	}catch (IOException e) {
        e.printStackTrace();
	}
	}

}
