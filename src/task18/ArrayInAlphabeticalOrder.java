package task18;
import java.util.Arrays;
import java.util.Scanner;

/*Create a method that can accept an array of String objects and sort in alphabetical order.
The elements in the left half should be completely in uppercase and the elements in the right half 
should be completely in lower case.Return the resulting array.Note: If there are odd number of String 
objects, then (n/2)+1 elements should be in UPPPERCASE*/

public class ArrayInAlphabeticalOrder {

	public static void main(String[] args) {
	String [] arr = {"Pavan","Ravi","Manoj","Sheela","Ramesh"};
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
	if(arr.length%2==0) {
		if(i<(arr.length/2)) {
			arr[i]=arr[i].toUpperCase();
		}
		if(i>(arr.length/2)) {
			arr[i]=arr[i].toLowerCase();
		}
	}else {
		if(i<(arr.length/2)+1) {
			arr[i]=arr[i].toUpperCase();
		}
		if(i>(arr.length/2)) {
			arr[i]=arr[i].toLowerCase();
		}
	System.out.print(" "+arr[i]);
	}
	}

	}

}
