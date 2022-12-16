package java013_api;

import java.util.Scanner;

public class Java140_Scanner { 
	
	public static void main(String[] args) {
		//콘솔창으로 데이터를 읽어오기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in); // in => 변수의 리턴타입
		
		System.out.println("이름:");
		
		//next() , nextLine() 메소드를 만나면 대기상태가 되며
		//사용자가 데이터를 입력하고 Enter을 하면
		//next() , nextLine() 메소드에서 읽는다.
		
		//String name = sc.next(); // 공백을 기준으로 앞에 있는 값만 읽어옴
		String name = sc.nextLine(); // 라인에 있는 값을 모두 읽어옴
		
		System.out.println(name);
		
		
		
		
		
		
		
		
		
	}//end main()

}//end class
