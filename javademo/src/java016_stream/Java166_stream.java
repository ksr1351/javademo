package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Java166_stream {

	public static void main(String[] args) {
		
		File file = new File("sample.txt"); //javademo폴더 안에 파일이 생성된다.
		System.out.println(file.exists());  //[출력결과] false / true
		System.out.println(file.isFile());  //[출력결과] false / true
		System.out.println(file.length());  //파일의 길이 [출력결과] 0 / 9
		//아직 파일이 존재하지 않기때문에 결과값이 위와 같이 나온다.
		
		FileWriter fw = null;
		
		try {
			//mode의 값이 true이면 append (기존에 있는 것에 더 작성해서 용량이 커진다.)
			//mode의 값이 false이면 update 
			//mode의 (생략)기본값은 false이다.
			fw = new FileWriter(file); //"sample.txt 파일이 생성된다.
			fw.write("java\n"); //임시 저장 장치인 buffer에만 저장되고 아직 파일에는 작성되지는 않는다.
			fw.flush();         //생성된 sample.txt 파일에 "java"가 작성된다.
			
			fw.write("jsp\n"); //buffer에 저장
			fw.flush(); //buffer에 저장된 데이터를 sample.txt 파일로 보내고 buffer를 비운다.
			
			fw.write(new char[] {'s','p','r','i','n','g'});
			fw.write("\n");
			fw.flush();
			fw.write(97); //int는 97이 아니라 유니코드 값이다.
			fw.write("\n");
			fw.flush();
			fw.write(new char[] {'s','p','r','i','n','g'}, 0, 3); 
			//0번째 인덱스부터 3개를 작성 //(chr[], int offset, int len)
			fw.write("\n");
			fw.close(); //close()메서드 호출 시, buffer에 있는것을 flush한 후 close 한다.
			
			//IOException 발생 : 
//			fw.write("mybatis");
//			fw.write("\n");
//			fw.flush();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}//end main()

}//end clas
