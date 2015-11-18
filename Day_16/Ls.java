
import java.io.*;

public class Ls{
	public static void main(String[] args) {
		File file = new File(".");
		String[] fileNames = file.list();
		for (int i = 0 ;i < fileNames.length ; i++) {
			System.out.println(fileNames[i]);
		}
	}
}