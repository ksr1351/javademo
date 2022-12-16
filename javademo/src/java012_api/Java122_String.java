package java012_api;

/*
 * [출력결과]
 * 35276은 숫자입니다.
 * 2_8a은 문자입니다.
 */

public class Java122_String {

	public static void main(String[] args) {
		System.out.print("35276은 ");
		prnDisplay(numCheck("35276"));
		
		System.out.printf("2_8a은 ");
		prnDisplay(numCheck("2_8a"));
	}//end main()

	
	public static boolean numCheck(String data) {
		//data값이 숫자면 true 아니면 false를 반환하는 로직 구현
		for(int i = 0; i <data.length(); i++) { //문자의 길이 : length()
			if(!(data.charAt(i)>='0'&& data.charAt(i)<='9'))
				return false;
		}
		
		return true;
	}//end numCheck;
	
	
	
	public static void prnDisplay(boolean chk) {
		// chk값이 true이면 "숫자입니다."
		// chk값이 false이면 "문자입니다." 로 출력하는 로직구현
		
		if(chk)
			System.out.println("숫자입니다.");
		else
			System.out.println("문자입니다.");
		
		
		
	}//end prnDisplay()
	
}//end class
