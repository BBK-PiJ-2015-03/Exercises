import java.io.*;

public class Cp{

	public static void main(String[] args) {
		Cp cp = new Cp();
		cp.checkLength(args);
		File copyFrom = new File(args[0]);
		File copyTo = new File(args[1]);
		try (BufferedReader in = new BufferedReader(new FileReader(copyFrom));
			 PrintWriter   out = new PrintWriter(copyTo)) {
			String line;
			int size = 0;
			while((line = in.readLine()) != null){
				size++;
				/// line from file

				// add line to new file
				out.println(line);

			}
		} catch (FileNotFoundException ex){
			System.out.println("File " + copyFrom + " does not exist.");
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}

	public void checkLength(String[] array){
		if(array.length > 2){
			System.out.println("ERROR: Can only take two arguments");
			System.exit(0);
		} else if(array.length < 2){
			System.out.println("ERROR: Must take two arguments");
			System.exit(0);
		}
	}


}