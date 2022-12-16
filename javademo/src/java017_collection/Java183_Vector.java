package java017_collection;




/*
 * [프로그램 출력결과]
 * kim:56 78 12 146
 * hong:46 100 97 243
 * park:96 56 88 240
 */
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.FileNotFoundException;


public class Java183_Vector {
	
	public static void main(String[] args) {
		String path = "./src/java017_collection/score.txt";
		Vector<Sawon> vt = lines(path);
		prnDisplay(vt);
		
	}//end main()
	
	private static Vector<Sawon> lines(String fileName){
		//strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한 후
		//리턴이라는 프로그램을 구현하시오
		
		Vector<Sawon> vt = new Vector<Sawon>();
		try(Scanner sc = new Scanner(new File(fileName))){
			while(sc.hasNextLine()) {
				//kim:56/ 78/ 12
				String[] data = sc.nextLine().split("[:/]");
				//kim:56 78 12
				//System.out.printf("%s %s %s %s",data[0],data[1],data[2],data[3]);
				
				Sawon sn = new Sawon(data[0],Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(data[3]));
				
				vt.add(sn);
			}
		}catch(FileNotFoundException ex) {
			System.out.println(ex.toString());
			
		}
		return vt;
	}//end lines()
	
	private static void prnDisplay(Vector<Sawon> vt) {
		//vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
		
		for(Sawon sn : vt)
			System.out.println(sn.toString());
		
		
		
	}//end prnDisplay()

}//end class
