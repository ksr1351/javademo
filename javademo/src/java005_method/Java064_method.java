package java005_method;

public class Java064_method {

	public static void main(String[] args) {
		char[] data = new char[] {'a','b','c'};
		System.out.println(data);
		System.out.printf("%s\n",data); //메모리 주소값이 나옴 [C@357246de
		System.out.println("data=" + data); //메모리 주소값이 나옴 data=[C@357246de
		
		int[] num = new int[] {1,2,3};
		System.out.println(num); // 메모리 주소값이 나옴 [I@28f67ac7

	}//end main()

}//end class
