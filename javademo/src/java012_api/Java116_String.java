package java012_api;

public class Java116_String {
	
	public static void main(String[] args) {
		String sn = "java"; //sn과 sg는 동일한 객체 사용
		String sg = "java";
		
		String st = new String("java"); //new는 무조건 새로운 객체를 생성하기 때문에 st와 ss의 객체는 다를 수 밖에 없음
		String ss = new String("java");
		
		//주소비교
		System.out.printf("sn==sg:%b\n", sn==sg); //true
		System.out.printf("st==ss:%b\n", st==ss); //false
		
		//메모리에 저장된 문자열 비교
		System.out.printf("sn.equals(sg):%b\n",sn.equals(sg)); //true
		System.out.printf("sn.equals(ss):%b\n",st.equals(ss)); //true (메모리에 저장된 문자열이 같음)
		
		//메모리에 저장된 문자열 리턴
		System.out.println(sn.toString()); //String에 저장된 문자열 리턴
		System.out.println(sn);
		
		
		
	}//end main()

}//end class
