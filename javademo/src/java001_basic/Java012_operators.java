package java001_basic;
//비교연산자의 값이 논리연산자의 값임
/*
 * true && true => true
 * true && false => false
 * false && true => false
 * false && false => false
 * 
 * true || true => true
 * true || false => true
 * false || true => true
 * false || false => false
 * 
 * !true => false
 * !false => true
 * 
 */
public class Java012_operators {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 6;
		int z = 3;
		
		boolean res;
		
		res = x < y && x == z;
		System.out.println(res); //true
		
		res = x > y || x == z;
		System.out.println(res); //true

	}// end main

}// end class
