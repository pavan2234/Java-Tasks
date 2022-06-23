package carCompany;

import java.io.*;
import java.util.Scanner;

public class CarDetails {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D:\\FileHandling\\CarCompany.txt");
		FileInputStream fis=new FileInputStream(file);   
		Scanner myscanner = new Scanner(file);
		while(myscanner.hasNextLine()){
			String data = myscanner.nextLine();
			System.out.println(data);

	}

}
}
