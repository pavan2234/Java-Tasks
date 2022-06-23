package schoolMedals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SchoolMedalsForDesired {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			Integer a =sc.nextInt();
			Integer b = sc.nextInt();
			map.put(a, b);
		}

        for (Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        for (Entry<Integer, Integer> m : map.entrySet()) {
        if(m.getValue()>=90) {
        	System.out.println(m.getKey()+"---Gold medal");
        }else if (m.getValue()>=80) {
        	System.out.println(m.getKey()+"---Silver medal");
        }else if(m.getValue()>=70) {
        	System.out.println(m.getKey()+"---Bronze medal");
        }else {
        	System.out.println("You are not elligible for medal");
        }

}
	}
}
