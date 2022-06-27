package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

class Manager extends Employee{
	public  void write() throws IOException {
		PrintWriter p=new PrintWriter("D:\\FILES\\TASKS.txt");
		p.println("Hello");
		System.out.println("Success");
		p.close();
	}
	public void read() throws IOException {
		FileReader filewriter=new FileReader("D:\\FILES\\TASKS.txt");
		BufferedReader b = new BufferedReader(filewriter);
		int i;
		while((i=b.read())!=-1)
			System.out.print((char)i);
	}


}