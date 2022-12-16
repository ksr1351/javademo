package java005_method;

public class Java059_method {

	public static void main(String[] args) {
	int data = 10;
	if (process(data)) {
		System.out.printf("%d는(은) 짝수입니다.\n", data);
	}else {
		System.out.printf("%d는(은) 홀수입니다.\n", data);
	}
	
	String result = process(data) ? "짝수" : "홀수";
	System.out.printf("%d는(은) %s입니다.\n", data, result);
	}//end main()
	
	public static boolean process(int data) {
		//data매개변수의 값이 짝수이면 true,
		//홀수이면 false를 리턴하는 메소드 구현
		if(data%2 ==0) {
			return true;
		}else {
			return false;
		}
	}

}//end class
