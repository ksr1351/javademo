package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java169_stream {

	public static void main(String[] args) {
		
		File file = new File("src/java016_stream/score.txt");
		RandomAccessFile raf = null;
		
		try {
			//"r"  : 읽기(read)만 가능하다. 
			//"rw" : 읽기(read) & 쓰기(write)가 가능하다.
			raf = new RandomAccessFile(file, "r");
			
			//getFilePointer()는 파일에서 현재 포인터 위치값을 리턴한다.
			System.out.println(raf.getFilePointer()); //[출력결과] 0
			System.out.println((char)raf.read()); //[출력결과] k : 읽고나면 포인터는 그다음 문자로 이동한다.
			System.out.println(raf.getFilePointer()); //[출력결과] 1
			System.out.println(raf.readLine()); //[출력결과] im:56/78/12
			System.out.println(raf.getFilePointer()); //[출력결과] 14
			System.out.println(raf.readLine()); //[출력결과] hong:46/100/97
			System.out.println(raf.getFilePointer()); //[출력결과] 30
			
			//포인터의 위치를 변경한다. (파일의 처음부터(0번부터) 포인터를 찾는다.)
			raf.seek(0); //포인터 위치를 0으로 이동해라
			System.out.println(raf.getFilePointer()); //[출력결과] 0
			System.out.println(raf.readLine()); //[출력결과] kim:56/78/12
			raf.seek(4);
			System.out.println(raf.getFilePointer()); //[출력결과] 4
			System.out.println(raf.readLine()); //[출력결과] 56/78/12
			
			//지정된 수 만큼 byte를 건너뛴다. (현재 포인터가 있는 위치를 기준으로 건너뛴다.)
			//전단계로는 이동할 수 없다. (즉, raf.skipBytes(-2)는 적용되지 않는다.)
			raf.skipBytes(2);
			System.out.println(raf.getFilePointer()); //[출력결과] 16
			System.out.println(raf.readLine()); //[출력결과] ng:46/100/97
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (raf != null) // 연결이 종료되지 않았으면 닫아주어라.
					raf.close();
			} catch (IOException e) {
				e.printStackTrace();

			}
		}
		
	}//end main()

}//end class
