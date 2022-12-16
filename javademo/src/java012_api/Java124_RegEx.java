package java012_api;
/*
 * 정규화 표현식(Regular Expression)
 * 1. 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을
 *    찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서
 *    작성한 문자열을 말한다.
 */

public class Java124_RegEx { //정규화표현식
	
	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";
		
		// a 또는 r 이면 '_' 로 변경
		for(int i = 0; i < sn.length(); i++) {
			char data = sn.charAt(i);
			if(data=='a' || data=='r') {
				sg += "_";
			}else {
				sg += data; //sg = sg + data
			}
		}
		
		System.out.println(sg);
		
		System.out.println("============Regular Expression을 이용한 문자 변경 ===============");
		//[]대괄호는 or을 의미한다.
		//sn변수에 저장된 문자열을 a이거나 r이면 "_"로 변경한다.
		System.out.println(sn.replaceAll("[ar]","_")); //여기서 []는 or 의 뜻 / a 또는 r
        
		sn="ba";
		System.out.println(sn.matches(".*[ar]")); //시작되는 값이 a거나 r이냐는 뜻(딱 하나의 문자일때만)
         // . : 임의의 문자 1개(b)
		 // * : 임의의 문자 여러개(0개 이상)
		 // + : 임의의 문자 1개 이상
		 // .*[ar] >> 끝나는 단어가 a 또는 r인지
		 // sn 변수에 저장된 문자열에 a 이거나 r로 끝나면 true를 리턴하고 아니면 false를 리턴한다.
		
		System.out.println(sn.matches("[ar].*"));
		//sn변수에 저장된 문자열이 a이거나 r로 시작하면 true를 리턴하고 아니면 false를 리턴한다.
		
		
		System.out.println(sn.matches(".*[ar].*"));
		//sn변수에 저장된 문자열이 a이거나 r이 포함되어 있으면 true를 리턴하고 아니면 false를 리턴한다.
		
		
		String st = "java@@@@korea";
		String sa = st.replaceAll("@{2,3}", "_"); //@가 2개이거나 3개이면 언더바로 바꿔라
		System.out.println(sa);
		
		sa = st.replaceAll("@{2}","_"); 
		System.out.println(sa);
				
		sa = st.replaceAll("@{2,}","_"); //무조건 @이가 두개이상이면 언더바로 바꿔라
		System.out.println(sa);		
				
				
		
		String [] line = st.split("@{4}"); //@4개를 하나의 기준으로 사용하겠다는 의미
		for(int i = 0; i<line.length; i++) {
			System.out.printf("line[%d]=%s\n",i,line[i]);
		}
		
		String sp = "java  jsp oracle      mybatis";
		String[] arr = sp.split("\s{1,}");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]=%s\n", i , arr[i]);
		}
		
		
		
		
				
				
	}//end main()

}//end class
