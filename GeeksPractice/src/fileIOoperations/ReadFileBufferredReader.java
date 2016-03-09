package fileIOoperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferredReader {
	public static void main(String[] args){
		BufferedReader br = null;
		String str ="";
		int count=1;
		try{
			br = new BufferedReader(new FileReader("C:\\Users\\RK\\Dropbox\\StudyMaterial\\Eclipse\\JavaPractice\\GeeksPractice\\src\\fileIOoperations\\sample.txt"));
			while((str = br.readLine()) != null){
				System.out.println("Loop count "+count++); // to track the loop is running
				System.out.println(str);
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException i){
			i.printStackTrace();
		}
	}

}
