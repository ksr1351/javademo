package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Java167_stream {

	public static void main(String[] args) {
		
		File file = new File("sample.txt");
		FileReader fr = null;
		int data;
		
//		try {
//			fr = new FileReader(file);
//			for(long i=0; i<file.length(); i++) { //sample.txt 파일을 읽어오기위함
//				System.out.print((char)fr.read()); //int값으로 읽기 때문에 char로 형변환
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			fr = new FileReader(file);
			//read()메소드는 file의 끝이면 -1을 리턴한다.
			while((data = fr.read()) != -1) { 
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) //연결이 종료되지 않았으면 닫아주어라.
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
////////////////////////////////////////////////////////////////////////////////
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
//			System.out.println(sc.nextLine()); 
			
			//has나 is로 시작하는 경우 존재하냐는 의미이므로 논리값으로 리턴한다.
			while(sc.hasNextLine()) { 
				System.out.println(sc.nextLine()); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(sc !=null)
				sc.close();
		}
		
	}//end main()

}//end class
