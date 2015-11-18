
import java.io.*;

public class Mkdir{

	public static void main(String[] args){
		for(int i = 0; i < args.length; i++){
			File folder = new File(args[i]);
			folder.mkdir();
		}
	}
}