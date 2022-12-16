package java013_api;

import static java.lang.Math.*;

public class Java135_Math {

	public static void main(String[] args) {
		//임의값 0.0 <= x(난수값 = 임의값) < 1,0
		double ran = random();
		System.out.println(ran);
		
		//0.00 <= x < 9.99
		ran = ran * 10;
		System.out.println(ran);
		
		System.out.println(floor(ran));
		
		//소수점 이하는 버림(0.0 ~ 9.0을 리턴)
		//정수 (0 ~ 9를 리턴)
		int num = (int)floor(ran); // round(ran / 반올림) , ceil(ran / 반올림x)
		System.out.println(num);
		
		//1부터 10까지
		num = num + 1;
		System.out.println(num);
		
		
		System.out.println("=======================================");
		
		System.out.println(((int)(floor(random()*10)))+1);
		
		

		
		
		
		
	}//end main()

}//end class
