package parkingSlotsForCarAndBike;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Vehicle {
	void Bike() {
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
		System.out.println("select the slot number");
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
	void Car() throws IOException {
		LinkedHashMap<Integer,String> b2= new LinkedHashMap<Integer,String>();
		b2.put(1,"Slot-1");
		b2.put(2,"Slot-2");
		b2.put(3,"Slot-3");
		b2.put(4,"Slot-4");
		b2.put(5,"Slot-5");
		b2.put(6,"Slot-6");
		b2.put(7,"Slot-7");
		b2.put(8,"Slot-8");
		b2.put(9,"Slot-9");
		b2.put(10,"Slot-10");
		b2.put(11,"Slot-11");
		b2.put(12,"Slot-12");
		b2.put(13,"Slot-13");
		b2.put(14,"Slot-14");
		b2.put(15,"Slot-15");
		for(Map.Entry m:b2.entrySet()) {
			System.out.println(m);
		}
		System.out.println("Enter the slot number");
		Scanner sc1 = new Scanner(System.in);
		Integer v = sc1.nextInt();
		if(b2.containsKey(v)) {
			System.out.println("Sucess you have selected ---"+b2.get(v));
		}else {
			System.out.println("Slot already booked select another slot");
		}
		b2.remove(v);
		for(Map.Entry m:b2.entrySet()) {
			System.out.println(m);
		}
	}

	}

