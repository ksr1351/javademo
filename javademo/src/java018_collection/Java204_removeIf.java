package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 함수적 인터페이스 : 자주 사용하는 기능을 정의할 수 있는 함수 제공이다.
 * 1. Consumer 
 * 	  - 입력은 있으나 출력은 없다.(void / return 타입)
 * 2. Supplier
 *    - 입력은 없으나 출력은 있다.(매개변수가 선언되지 않음)
 * 3. Predicate
 * 	  - 입력이 있고 출력이 true 또는 false로만 리턴한다.
 * 
 */

public class Java204_removeIf {

	public static void main(String[] args) {
		Integer[] it = new Integer[] {3,5,2,4,7};
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList);
		
		//argument 를 받아 true 값으로 반환되는 요소만 삭제
		//Predicate<Integer>
		aList.removeIf(x -> x%2==0);
		System.out.println(aList.toString());
		
	}//end main()

}//end class
