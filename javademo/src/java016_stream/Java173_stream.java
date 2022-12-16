package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.File;
import java.io.IOException;

public class Java173_stream {

	public static void main(String[] args) {
		
		File file = new File("src/java016_stream/test.txt"); 
		
		if(!file.exists()) { //파일의 존재여부를 물어본다.
			try {
				file.createNewFile(); //파일이 존재하지 않는다면 test.txt 파일 생성
				System.out.println("test.txt 파일 생성");
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		System.out.println("program end");
		
	}//end main()

}//end class