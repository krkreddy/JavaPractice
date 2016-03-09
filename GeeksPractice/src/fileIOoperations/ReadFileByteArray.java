package fileIOoperations;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileByteArray {
	public static void main(String[] args){
		String fileName = "C:\\Users\\RK\\Dropbox\\StudyMaterial\\Eclipse\\JavaPractice\\GeeksPractice\\src\\fileIOoperations\\sample.txt";
		InputStream in = null;
		try{
			in = new FileInputStream(fileName);
			byte data[] = new byte[2*1024];
			int readCount = 0;
			if((readCount = in.read(data)) > 0){
				System.out.println(new String(data,0,readCount-1));
			}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		} catch(IOException i){
			i.printStackTrace();
		} finally{
			try{
				if(in != null) in.close();
			}catch(Exception ex){
				
			}
		}
	}

}
