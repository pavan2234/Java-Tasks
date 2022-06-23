package carCompany;

import java.util.HashMap;

public class CarCompany {

	public static void main(String[] args) {
	HashMap<String,Integer> cars = new HashMap<String,Integer>();
	cars.put("Benz", 1);
	cars.put("Skoda",2);
	cars.put("BMW", 2);
	System.out.println(cars);
	cars.forEach((k,v) -> System.out.println(k+"-----"+v));;
	}

	}

