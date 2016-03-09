package fileIOoperations;

import java.io.File;

public class FilesInFolder {
	public static void main(String[] args){
		File file = new File("C:\\Users\\RK\\Dropbox\\StudyMaterial\\Eclipse\\JavaPractice\\GeeksPractice\\src\\fileIOoperations\\AllFiles");
		
		String[] fileList = file.list();
		for(String str : fileList)
			System.out.println(str);
		
		File[] files = file.listFiles();
		for(File path : files)
			System.out.println(path);
	}
}