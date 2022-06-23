package java8tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatch {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Delhi");
		boolean answer = stream.anyMatch(str -> Character.isUpperCase(str.charAt(0)));
		System.out.println(answer);
		Stream<String> stream1 = Stream.of("Delhi");
		boolean answer1
        = stream1.noneMatch(str -> (str.length() == 4));
		System.out.println(answer1);
		List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
	    boolean answer3 = list.stream().allMatch(n-> n % 3 ==0);
	    System.out.println(answer3);
	}

}
