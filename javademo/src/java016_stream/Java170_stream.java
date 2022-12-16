package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Java170_stream {

	public static void main(String[] args) {
		File file = new File("src/java016_stream/song.txt");
		RandomAccessFile raf = null;
		String stn = new String("Maron 5 - Daylight, Sunday Moring\r\n");
		
		try {
			raf = new RandomAccessFile(file, "rw");
			
			//song.txt 파일의 총 길이를 리턴한다.
			long size = raf.length();
			//포인터를 파일의 끝으로 이동한다.
			raf.seek(size);
			//파일 대상에 데이터를 보낼 때 flush()를 실행하지 않아도 된다.
			//String stn을 파일에 작성해준다. (즉, writeByte 자체에 flush가 설정되어있다는 의미)
			raf.writeBytes(stn);
			//raf.writeUTF(stn); //문장 앞에 # 기호가 붙는다.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(raf != null) {
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}//end main()

}//end class
