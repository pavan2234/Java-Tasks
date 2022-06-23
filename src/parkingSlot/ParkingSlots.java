package parkingSlot;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingSlots {

	public static void main(String[] args) {
	LinkedHashMap<Integer,String> b1= new LinkedHashMap<Integer,String>();
	b1.put(1,"Slot-1");
	b1.put(2,"Slot-2");
	b1.put(3,"Slot-3");
	b1.put(4,"Slot-4");
	b1.put(5,"Slot-5");
	b1.put(6,"Slot-6");
	b1.put(7,"Slot-7");
	b1.put(8,"Slot-8");
	b1.put(9,"Slot-9");
	b1.put(10,"Slot-10");
	b1.put(11,"Slot-11");
	b1.put(12,"Slot-12");
	b1.put(13,"Slot-13");
	b1.put(14,"Slot-14");
	b1.put(15,"Slot-15");
	for(Map.Entry m:b1.entrySet()) {
		System.out.println(m);
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter 1 for bike");
	System.out.println("Please enter 2 for car");
	Integer brc = sc.nextInt();
	if(brc==1) {
		System.out.println("You have selected Bike");
	}else {
		System.out.println("You have selected Car");
	}
	System.out.println("Enter the slot number");
	Scanner sc1 = new Scanner(System.in);
	Integer v = sc1.nextInt();
	if(b1.containsKey(v)) {
		System.out.println("Sucess you have selected ---"+b1.get(v));
	}else {
		System.out.println("Slot already booked select another slot");
	}
	b1.remove(v);
	for(Map.Entry m:b1.entrySet()) {
		System.out.println(m);
	}
}
}
