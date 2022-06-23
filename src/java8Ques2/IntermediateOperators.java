package java8Ques2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperators {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
        System.out.println("The distinct elements are :");
        list.stream().distinct().forEach(System.out::println);
        
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
        List<Integer> newList = evenNumInfiniteStream.limit(10)
                .collect(Collectors.toList());
        	System.out.println(newList);	
        	
        List<Integer> list2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        		    .skip(6)
        		    .collect(Collectors.toList());
        		System.out.println(list2);
        		
        List<Integer> list3
                 = Arrays.asList(0, 2, 4, 6, 8, 10);
             list3.stream().peek(System.out::println).count();
             
        List<String> list4 = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
             list4.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
	}

}
