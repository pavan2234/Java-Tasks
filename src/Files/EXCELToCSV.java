package Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class EXCELToCSV {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader filereader=new FileReader("D:\\FILES\\Task.xls");
		PrintWriter printwriter=new PrintWriter("D:\\FILES\\Task.CSV");
		Scanner sc=new Scanner(filereader);
		while(sc.hasNext()) {
			printwriter.println(sc.next());
		}
		System.out.println("Success");
		printwriter.close();
	}
}