package java012_api;

public class Java115_String {
	
	public static void main(String[] args) {
		char[] data = {'j','a','V','A'};
		MyString mString = new MyString(data);
		System.out.println(mString.length());
		System.out.println(mString.isUpperCase(2));
		System.out.println(mString.isLowerCase(0));
		System.out.println(mString.charAt(0));
		System.out.println(mString.toString());
		System.out.println(mString); //객체만 호출해도 toString과 결과값은 같다.
		
	}//end main()

}//end class
