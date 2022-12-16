package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Java206_clone {

	public static void main(String[] args) {
		Integer[] it = new Integer[] { 3, 5, 2, 4, 7 };
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println("sourceList:" + aList);

		// shallow copy : 주소복사가 되기 때문에 (하나가 바뀌면 참조되는 것 까지 바뀜)
		ArrayList<Integer> copyList = aList;
		System.out.println("copyList :" + copyList);

//		copyList.set(0, 10); //0번째의 값을 10으로 바꾸어라.
//		System.out.println("sourceList:" + aList);
//		System.out.println("copyList :" + copyList);

		ArrayList<Integer> destList = new ArrayList<Integer>();
		for (int i = 0; i < aList.size(); i++) {
			destList.add(aList.get(i));
		}

		System.out.println("destList :" + destList);
		destList.set(0, 20);
		System.out.println("sourceList:" + aList);
		System.out.println("destList :" + destList);

		///////////// clone/////////////////////////////////////
		ArrayList<Integer> cloneList = (ArrayList<Integer>) aList.clone();
		System.out.println("cloneList :" + cloneList);

		cloneList.set(0, 30);
		System.out.println("sourceList:" + aList);
		System.out.println("cloneList :" + cloneList);

	}// end main()

}// end class
