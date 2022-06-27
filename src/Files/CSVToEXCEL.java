package Files;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSVToEXCEL {
		public static void main(String[] args) throws IOException {
			FileReader filereader=new FileReader("D:\\FILES\\TASKS.txt");
			PrintWriter printwriter=new PrintWriter("D:\\FILES\\Task.xls");
			Scanner sc=new Scanner(filereader);
			while(sc.hasNext()) {
				printwriter.println(sc.next());
			}
			printwriter.close();
			System.out.println("Success");
		}
}