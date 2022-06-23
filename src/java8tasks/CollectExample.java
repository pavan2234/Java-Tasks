package java8tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String itemName;
	float price;
Product(int id,String itemName,float price) {
	this.id= id;
	this.itemName=itemName;
	this.price=price;
}
}
public class CollectExample {

	public static void main(String[] args) {
	List<Product> productList = new ArrayList<Product>();
	productList.add(new Product(1,"DELL",2800f));
	productList.add(new Product(2,"APPLE",4500f));
	productList.add(new Product(3,"WINDOWS",7800f));
	productList.add(new Product(4,"INTEL",2500f));
	productList.add(new Product(5,"HTC",3000f));
	List<String> newList = productList.stream()
			.filter(p->p.price>2500)
			.map(p->p.itemName)
			.collect(Collectors.toList());
	System.out.println(newList);
	

	}

}
