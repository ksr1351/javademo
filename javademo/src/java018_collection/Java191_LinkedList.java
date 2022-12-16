package java018_collection;

import java.util.LinkedList;

/*
 * Queue(큐)
 * 1. FIFO(First In First Out) : 제일 먼저 저장한 요소를 먼저 꺼내온다.
 * 2. 최근 사용문서, 인쇄작업대기목록, 버퍼
 */
public class Java191_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		
		//append
		nQueue.offer(new String("java")); // 저장하는 방식 : offer
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		
		System.out.println(nQueue.size());
		
		//System.out.println(nQueue.poll()); // 제일 먼저 입력된 것을 가져옴
		//System.out.println(nQueue.poll());
		//System.out.println(nQueue.poll());
		//System.out.println(nQueue.poll()); // null(0)
		
		System.out.println(nQueue.size());
		
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
		System.out.println(nQueue.size());
		
		
		
		
		
		
		

	}//end main()

}//end class
