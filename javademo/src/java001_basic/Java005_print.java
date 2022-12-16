package java001_basic;

public class Java005_print {

	public static void main(String[] args) {
		byte bNum = 2; // -128 ~ 127
		short sNum = 4; // -32,768 ~ 32,767
		int xNum = 5;
		long lNum = 6L; // L or l
		float fNum = 2.5F; // F or f
		double dNum = 7.4; // float 보다 용량이 더 큼
		char cData = 'a'; // 하나의 문자만 저장 가능
		boolean eNum = true; // true or false
		String sData = "java"; // 문자열 인식은 쌍따옴표만

		System.out.println(bNum + "," + sNum);
		// +의 용도 : 산술연산자 또는 문자열 연결(",")
		
		/*
		 * System.out.printf("출력형식", 값1, 값2, 값3...);
		 * 출력기호
		 * %d : 정수(byte,short,int,long)
		 * %f : 실수(float, double)
		 * %b : 논리(boolean)
		 * %c : 문자(char)
		 * %s : 문자열(String)
		 * %% : %
		 * \n : 줄바꿈
		 * \t : 탭
		 * print : 줄바꿈 없이 출력
		 * println : 줄바꾸고 출력
		 * printf : 
		 */
		
		System.out.printf("%d %d %d %d\n",bNum, sNum, xNum, lNum);
		// \n은 줄바꿈 기능
		System.out.printf("%.1f %.1f\n", fNum, dNum);
		// 5 이상의 값이 있으면 반올림 되어서 출력됨
		System.out.printf("%.1f %.1f %c %b\n", fNum, dNum, cData, eNum);
		System.out.printf("%.1f %.1f %c %b %s\n", fNum, dNum, cData, eNum, sData);
		System.out.printf("%d %% %d = %d\n",5,2,5%2); // 5 % 2 = 1
		
		System.out.print("java");
		// 강제 줄바꿈 java\n 
		// 강제 띄어쓰기 java\t
		System.out.print("program");
		System.out.println();
		System.out.println("jsp");
		
		
		
		
		

	}// end main()

}// end class
