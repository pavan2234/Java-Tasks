package java8tasks;

import java.util.ArrayList;
import java.util.List;

class StoreDept{
	String name;
	float price;
StoreDept(String name,float price){
	this.name=name;
	this.price=price;
}
}
public class ReduceExample {
	public static void main(String[] args) {
	List<StoreDept> grcyList = new ArrayList<StoreDept>();
	grcyList.add(new StoreDept("Sugar",50f));
	grcyList.add(new StoreDept("Flour",35f));
	grcyList.add(new StoreDept("Soaps",120f));
	grcyList.add(new StoreDept("Shampoo",20f));
	Float newgrcyList = grcyList.stream()
			.map(p->p.price)
			.reduce(0.0f,(Sum,price)->Sum+price);
	System.out.println(newgrcyList);
	Float newgrcyList2 = grcyList.stream()
			.map(p->p.price)
			.reduce(0.0f,Float::sum);
	System.out.println(newgrcyList2);
	

	}

}
