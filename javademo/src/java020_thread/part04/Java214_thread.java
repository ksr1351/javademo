package java020_thread.part04; //DAY19 [2022.12.09.FRI]

/*
 * 스레드는 우선순위 값을 지정할 수 있고 지정을 안하면 자바에서는 기본값을 가져온다.
 * 
 * setPriority(int newPriority)
 * getPriority()
 * 
 * Thread의 우선순위는 1~10까지 지정할 수 있다. (자바에서) 
 * Thread.MAX_PRIORITY = 10
 * Thread.NORM_PRIORITY = 5
 * Thread.MIN_PRIORITY = 1
 * 
 * Thread이름을 지정하지 않으면 Thread-0, Thread-1.. 순서로 지정된다.
 * 이름은 setName()을 이용하여 지정한다.
 */

public class Java214_thread {

	public static void main(String[] args) {
		
		PriorityTest t1 = new PriorityTest();
		t1.start();
		
		PriorityTest t2 = new PriorityTest();
//		t2.setPriority(Thread.MAX_PRIORITY); //Thread 우선순위 지정
		t2.setPriority(10);
		t2.start();
		
		PriorityTest t3 = new PriorityTest();
		t3.setPriority(3);
		t3.start();
		
		PriorityTest t4 = new PriorityTest();
		t4.setName("work"); //Thread 이름 지정
		t4.start();
		
		PriorityTest t5 = new PriorityTest();
		t5.setName("Play");
		t5.setPriority(7);
		t5.start();
		
	}//end main()

}//end class
