import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filestor {
public static void main(String[] args) throws IOException {
	File file = new File("D:\\FileHandling\\parkingslots.txt");
	FileWriter fwr = new FileWriter(file);
	fwr.write("Im writing directly");
	FileWriter file1 = new FileWriter("D:\\FileHandling\\File789.txt");
	file1.write("This is written from the program of java");
	file1.close();
	System.out.println("Successfully written in the file");
}
}
