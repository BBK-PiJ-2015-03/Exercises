import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class TemperatureAverages{

	public static void main(String[] args) {
		File csvFile = new File(args[0]);
		int[] intArr;
		try (BufferedReader in = new BufferedReader(new FileReader(csvFile))){
			List<String> stringArray = new ArrayList<String>();
			String line;
			for(int i = 0; (line = in.readLine()) != null; i++){
				stringArray.add(line);
			}
			List<Integer> intArray = new ArrayList<Integer>();
			String[] lineArray;
			int count = 0, avg = 0, totalAvg = 0, totalCount = 0;
			for(int i = 0; i < stringArray.size(); i++){
				lineArray = stringArray.get(i).split(", ");
				for(int j = 0; j < lineArray.length; j++){
					System.out.print(lineArray[j] + ", ");
					avg += Integer.parseInt(lineArray[j]);
					count++;
				}
				System.out.print(" Average: " + (avg/count));
				System.out.println();
				totalAvg += avg;
				totalCount += count;
				avg = 0;
				count = 0;
			}
			System.out.println("Total Average: " + (totalAvg/totalCount));
		} catch (FileNotFoundException ex){
			System.out.println("File " + args[0] + " does not exist.");
		} catch (IOException ex){
			ex.printStackTrace();
		}
	}
}