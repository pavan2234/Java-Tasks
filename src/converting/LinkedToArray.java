package converting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LinkedToArray {
   public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<String>();
      list.add("Orange");
      list.add("Apple");
      list.add("Peach");
      list.add("Guava");
      list.add("Pear");
      List<String> aList = new ArrayList<String>(list);
      System.out.println("The ArrayList elements are: ");
    for (Object i : aList) {
         System.out.println(i);
      }
   }
}