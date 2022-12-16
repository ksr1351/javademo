package java013_api;

import java.util.Random;

public class Java138_Random {
	
	public static void main(String[] args) {
		Random ran = new Random();
		double r1 = ran.nextDouble(); //양수값만 나옴
		System.out.println(r1);
		
		int r2 = ran.nextInt(); //음수값도 나옴(마이너스)
		System.out.println(r2);
		
		int r3 = ran.nextInt(10); //0부터 10미만의 정수값 구함
		System.out.println(r3);
		
		//1부터 10까지의 난수값 구하기
		System.out.println(r3+1);
		
		
		
		
		
	}//end main()

}//end class
