package java017_collection; //필요할 때마다 데이터를 저장할 메모리를 생성하는 방법

import java.util.Vector;
// vector => 배열 방식을 이용해서 데이터 저장

//process => 처리방식결정 , 알고리즘 작성

//data structure(자료구조) => 처리대상 결정 , 자료정의 (원하는 형태로 자료 저장)
// => 메모리절약 , 프로그램 수행 시간 단축

public class Java178_Vector {
	
	public static void main(String[] args) {
		Vector v = new Vector();
		
		// Integer => Object : up-casting
		v.add(new Integer(10)); //deprecated
		v.add(new Integer(20));
		
		// int => Integer => Object : autox boxing => up-casting
		v.add(30);
		v.add(40);
		
		// String => Object : up-casting
		v.add(new String("java"));
		
		// Type mismatch: cannot convert from Object to Integer
		// Integer it1 = v.get(0);
		
		// Object => Integer : down-casting
		Integer it1 = (Integer)v.get(0);
		Integer it2 = (Integer)v.get(1);
		Integer it3 = (Integer)v.get(2);
		Integer it4 = (Integer)v.get(3);
		String sn = (String)v.get(4);
		System.out.println(it1.intValue());
		System.out.println(it2.intValue());
		System.out.println(it3.intValue());
		System.out.println(it4.intValue());
		System.out.println(sn);
		
		try {
		System.out.println(v.get(20));
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}

		
	}//end main()

}//end class
