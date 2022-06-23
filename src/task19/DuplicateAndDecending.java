package task19;
import java.util.Arrays;
import java.util.Scanner;
public class DuplicateAndDecending {
	public static int removeDuplicateElements(int array[], int n1){  
        if (n1==0 || n1==1){  
            return n1;  
        }  
        int[] temp = new int[n1];  
        int j = 0;  
        for (int i=0; i<n1-1; i++){  
            if (array[i] != array[i+1]){  
                temp[j++] = array[i];  
            }  
         }  
        temp[j++] = array[n1-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            array[i] = temp[i];  
        }  
        return j;  
    }  
	
	public static void main(String[] args) {
		 int array[] = new int[10];
		 Scanner sc = new Scanner(System.in);
		 for(int i=0;i<10;i++) {
			 array[i]=sc.nextInt();	 
		 }	Arrays.sort(array);
	        int length = array.length;  
	        length = removeDuplicateElements(array, length);    
	        for (int i=0; i<length; i++) {  
	           System.out.print(array[i]+" "); 
	        }
	       
		
	} 

}
