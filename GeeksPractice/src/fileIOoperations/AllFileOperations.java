package fileIOoperations;

import java.io.File;
import java.io.IOException;

public class AllFileOperations {
	public static void main(String[] args){
		File file = new File("sample.txt");
		try{
			System.out.println(file.canRead());
			// checks whether it can modify the file
			System.out.println(file.canWrite());
			System.out.println(file.createNewFile());
			System.out.println(file.delete());
			System.out.println(file.exists());
			// returns string with the absolute path of the file
			System.out.println(file.getAbsolutePath());
			// checks whether it is a directory
			System.out.println(file.isDirectory());
			System.out.println(file.isHidden());
			// returns th list of files present in the directory
			System.out.println(file.list());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
