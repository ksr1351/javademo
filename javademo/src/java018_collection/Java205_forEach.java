package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Java205_forEach {
	public static void main(String[] args) {
		Integer[] it = new Integer[] { 3, 5, 2, 4, 7 };
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList);
		
		//aList.forEach(x -> System.out.println(x));
		
		//aList.forEach((Integer x) -> System.out.println(x));
		
		Consumer<Integer> con = x -> System.out.println(x);
		aList.forEach(con);
		//함수형(->)프로그램에는 문장이 포함되어야한다.
		
		
		
		

	}// end main()
}// end class
