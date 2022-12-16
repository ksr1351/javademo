package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java172_stream {

	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("src/java016_stream/temp");
//		File file = new File("src/java016_stream/a/b");
//
//		if(file.isDirectory()) {
//			file.delete();  
//			//delete()는 폴더 삭제 후 이후 코드가 실행되지만,
//			//deleteOnExit()는 시스템이 종료되는 시점에 파일이 삭제된다.
//			file.deleteOnExit(); 
//			System.out.println("폴더 삭제");
//		} else {
//			System.out.println("폴더 없음");
//		}
/////////////////////////////////////////////////////////////////////////////
		File file = new File("sample.txt");
		//file.delete();
		file.deleteOnExit(); //시스템이 종료될때 지정된 파일(sample.txt)을 삭제한다.
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		sc.close();
		
	}//end main()

}//end class
