package java004_array;

public class Java038_array {

	public static void main(String[] args) {

		// javascript
		// let myArray = [1,2,3,"홍길동","아무개"];

		// java
		int[] data = { 10, 20, 30 }; // 직접 초기값 설정하고 싶을 때
		int[] jumsu = new int[]	{90, 80, 40}; // 초기값을 직접 설정했을 땐 new int[] 에 크기를 넣으면 문법적으로 안됨
		
		for(int i = 0; i<data.length; i++) {
			System.out.printf("data[%d]=%d\n", i, data[i]);
		}
		
		System.out.println(data[2]);
		System.out.println(data[1]);
		System.out.println(data[0]);
		
		for(int i=2; i>=0; i--) {
			System.out.printf("data[%d]=%d\n", i, data[i]);
		}
		
		
		
	}// end main()

}// end class
