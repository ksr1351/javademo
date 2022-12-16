package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.File;

public class Java171_stream {

	public static void main(String[] args) {
		
		File file = new File("src/java016_stream/a/b");
		
		if(!file.isDirectory()) {
//			file.mkdir();  //한번에 하나의 디렉토리 생성
			file.mkdirs(); //한번에 여러개의 디렉토리 생성
			System.out.println("폴더 생성");
		}else {
			System.out.println("폴더 존재");
		}
		
	}//end main()

}//end class
