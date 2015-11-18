
import java.io.*;

public class CatB{

	public static void main(String[] args){
		CatB launcher = new CatB();
		for(int i = 0; i < args.length; i++){
			launcher.printFile(args, i);
		}
	}

	public void printFile(String[] array, int i){
		File file = new File(array[i]);
		System.out.println("=================================");
		System.out.println("File Name: " + array[i]);
		System.out.println("=================================");
		BufferedReader in = null;
		try {
			if(file.exists()){
				String line;
				in = new BufferedReader(new FileReader(file));
				while((line = in.readLine()) != null){
					System.out.println(line);
				}
			}
		} catch (FileNotFoundException ex){
			System.out.println("File " + file + " does not exists.");
		} catch (IOException ex){
			ex.printStackTrace();
		} finally {
			closeReader(in);
		}
	}

	public void closeReader(Reader reader){
		try{
			if(reader != null){
				reader.close();
			}
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}
}