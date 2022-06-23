package parkingSlotsForCarAndBike;

import java.io.*;
import java.util.*;

public class ParkingSlots extends Vehicle{
	
	public static void main(String[] args) throws IOException {
		while(true) {
		System.out.println("Enter your name");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		System.out.println("Enter the phone number");
		Scanner sc2 = new Scanner(System.in);
		double phno = sc2.nextDouble();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 1 for bike");
		System.out.println("Please enter 2 for car");
		Integer brc = sc.nextInt();
		if(brc==1) {
			System.out.println("You have selected Bike");
			Vehicle b = new Vehicle();
			b.Bike();
		}else if(brc==2){
			System.out.println("You have selected Car");
			Vehicle c = new Vehicle();
			c.Car();
		}else {
			System.out.println("You have entered wrong number");
		}

		System.out.println("The receipt for slot booking is ---");
		System.out.println(name+" "+phno);
		File file = new File("D:\\FileHandling\\parkingslots.txt");
		FileWriter fwr = new FileWriter(file,true);
		fwr.write(name);
		fwr.write((int) phno);
		fwr.close();

}
}
}