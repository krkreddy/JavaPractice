package fileIOoperations;

import java.io.File;
import java.io.FilenameFilter;

public class MatchFileExtension {
	public static void main(String[] args){
		File file = new File("C:\\Users\\RK\\Dropbox\\StudyMaterial\\Eclipse\\JavaPractice\\GeeksPractice\\src\\fileIOoperations\\AllFiles");
		String[] files = file.list(new FilenameFilter(){
			public boolean accept(File dir, String name){
				if(name.toLowerCase().endsWith(".xlsx"))
					return true;
				else
					return false;
			}
		});
		for(String str : files)
			System.out.println(str);
	}

}
