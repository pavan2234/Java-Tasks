package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Employee{
	public  void create() throws Exception {
		File f=new File("D:\\FILES\\TASKS.txt");               //Creating  the file
		System.out.println(f.exists());
		try {
			f.createNewFile();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(f.exists());

		System.out.println("Success");
	}
	public void write() throws IOException {
		PrintWriter p=new PrintWriter("D:\\FILES\\TASKS.txt");           //Writing to the file
		p.println("Printing the data");
		System.out.println("Success");
		p.close();
	}
	public void read()throws IOException{
		FileReader filewriter=new FileReader("D:\\FILES\\TASKS.txt");         //Reader .
		BufferedReader b = new BufferedReader(filewriter);
		int i;
		while((i=b.read())!=-1)
			System.out.print((char)i);
	}

}


