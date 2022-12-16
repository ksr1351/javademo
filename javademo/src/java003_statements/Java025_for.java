package java003_statements;

public class Java025_for {

	public static void main(String[] args) {
		//누적된 값이 최초로 15이상일 때까지만 반복문을 수행
		
		int sum = 0;
		int i;
		
		for(i=1; ;i++) {
			sum = sum + i;
			if(sum>=15) {
			break;
				// 해당 break 는 for에 대한 용도임
			}
		}

		System.out.printf("i=%d sum=%d\n", i, sum);
	}//end main()

}//end class
