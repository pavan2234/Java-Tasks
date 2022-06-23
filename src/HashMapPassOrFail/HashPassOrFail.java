package HashMapPassOrFail;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashPassOrFail {

	public static void main(String[] args) {
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<3;i++) {
		String a =sc.nextLine();
		Integer b = sc.nextInt();
		map.put(a, b);
	}
        for (Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
		
	
	

	}

}
