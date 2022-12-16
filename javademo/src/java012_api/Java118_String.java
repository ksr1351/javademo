package java012_api;

/*
 * [출력결과]
 * ip:127.0.0.1
 * port:8080
 */
public class Java118_String {
	
	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		//1. String st = new String(sn);
		
		//2. int index = sn.indexOf(":");
		//2. System.out.println("ip:" + sn.substring(0, index));
		//2. System.out.println("port:" + sn.substring(index + 1));
		
		//1. System.out.println("ip:" + st.substring(0,9));
		//1. System.out.println("port:" + st.substring(10));
		
		String[] data = sn.split(":"); // 콜론을 기준으로 나누어짐 [0] , [1]
		System.out.println("ip:" + data[0]);
		System.out.println("port:" + data[1]);
		
		
		
		
	}//end main()

}//end class
