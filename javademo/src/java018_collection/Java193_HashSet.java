package java018_collection;

import java.util.HashSet;

//HashSet : 중복허용 안되고 순서 유지 안됨.

public class Java193_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));

		for (Integer it : set)
			System.out.println(it); // 순서유지 x , 중복체크 o

	}// end main()

}// end class
