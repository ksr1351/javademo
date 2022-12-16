package java015_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Java158_exception {
	
	public static void main(String[] args) {
		File file = new File("sample.txt");
		
		FileReader fr = null;
		
		//FileNotFoundException 은 checked exception이다.
		//반드시 try~catch~finally(예외처리)를 한다.
		
		try {
			fr = new FileReader(file); //new FileReader("sample.txt")
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}//end main()

}//end class
