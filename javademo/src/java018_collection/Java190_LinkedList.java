package java018_collection;
/*
 * stack(스택)
 * 1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 */

import java.util.LinkedList;

public class Java190_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();

		// append
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));

		System.out.println(nStack.size());

		// System.out.println(nStack.pop()); //메모리의 마지막 값을 가져옴
		// System.out.println(nStack.pop());
		// System.out.println(nStack.pop());
		// System.out.println(nStack.pop()); // java.util.NoSuchElementException

		// 메모리 안이 비지 않았으면
		while (!nStack.isEmpty())
			System.out.println(nStack.pop());

		System.out.println(nStack.size());

	}// end main()

}// end class
