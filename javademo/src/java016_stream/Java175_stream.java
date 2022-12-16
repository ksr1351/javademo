package java016_stream; //DAY15 [2022.12.05.MON]

/* <재귀호출>
 * 최하위 폴더나 파일 삭제 뿐만아니라 동일 폴더에 있는 파일과 상위폴더도 삭제하도록 하는 반복문 프로그램 구현
 */

import java.io.File;

public class Java175_stream {

	public static void main(String[] args) {
		
		File file = new File("src/java016_stream/a");
		deleteFileList(file);
		
	}//end main()
	
	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		
		System.out.println(fileAll.length);
		
		if(fileAll.length != 0) {
			for(File file : fileAll) { 
				System.out.println(file);
				if(file.isFile()) //존재하는 것이 파일인지(디렉토리X)
					file.delete();
				else
					deleteFileList(file);
			}
		}
		
		System.out.println("Remove File :" + srcFile.getPath());
		srcFile.delete();
		
	}//end deleteFileList()

}//end class
