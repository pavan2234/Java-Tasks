package java8tasks;

import java.util.ArrayList;
import java.util.List;

public class ForEachAndOrdered {

	public static void main(String[] args) {
	List<String> fruitList =  new ArrayList<String>();
	fruitList.add("Apple");
	fruitList.add("Banana");
	fruitList.add("Orange");
	fruitList.add("PineApple");
	fruitList.forEach(fruit->System.out.println(fruit));
	fruitList.forEach(System.out::println);
	fruitList.stream().forEachOrdered(fruit->System.out.println(fruit));
	fruitList.stream().forEachOrdered(System.out::println);
	}

}
