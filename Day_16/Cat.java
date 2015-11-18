
import java.io.*;

public class Cat{

	public static void main(String[] args){
		try{
			if(args.length > 1){
				System.out.println("ERROR: Cannot check more than one directory at a time");
			} else { 
				File folder = new File(args[0]);
				if(folder.exists()){
					File file = new File(args[0]);
					String[] fileNames = file.list();
					for (int i = 0 ;i < fileNames.length ; i++) {
						System.out.println(fileNames[i]);
					}
				} else {
					System.out.println("ERROR: Directory does not exists");
				}
			}
		} catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ERROR: No argument presented");
			ex.printStackTrace();
		}
	}
/*
	/**
	* Prints all contents of a directory
	*
	public void ls(String[] args){
		File file = new File(args[0]);
		String[] fileNames = file.list();
		for (int i = 0 ;i < fileNames.length ; i++) {
			System.out.println(fileNames[i]);
		}
	}

	/**
	* Checks if a folder exists, if so prints contents on screen.
	* Also checks that user has only inputed one argument
	*
	public void checkDir(File folder){
		if(args.length > 1){
			System.out.println("ERROR: Cannot check more than one directory at a time");
		} else { 
			File folder = new File(args[0]);
			if(folder.exists()){
				ls(folder);
			} else {
				System.out.println("ERROR: Directory does not exists");
			}
		}
	}
*/
}