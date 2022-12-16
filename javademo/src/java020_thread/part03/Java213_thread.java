package java020_thread.part03; //DAY19 [2022.12.09.FRI]

/*
 [출력결과]
 NEW
 cc : RUNNABLE
 main end
 RUNNABLE
 /////////////////////////////////////////////////////////
  * LifeCycle 스레드를 다 수행한 후 main 스레드를 수행하도록 구현 : join()
 [출력결과]
 NEW
 RUNNABLE
 Thread-0  TERMINATED  false
 main end
 */

public class Java213_thread {

	public static void main(String[] args) {
		
//		LifeCycle cc = new LifeCycle();
//		System.out.println(cc.getState()); //[출력결과] NEW
//		
//		cc.start(); //LifeCycle 스레드 실행 //[출력결과] RUNNABLE
//		
//		System.out.println("cc : " + cc.getState()); //[출력결과] cc : RUNNABLE
//		System.out.println("main end");		
////////////////////////////////////////////////////////////////////////////////
		
		LifeCycle cc = new LifeCycle();
		System.out.println(cc.getState()); //[출력결과] NEW
		
		cc.start(); //LifeCycle 스레드 실행 //[출력결과] RUNNABLE
		
		try {
			//cc 작업스레드가 종료될때까지 대기하고 있다.
			cc.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//현재 스레드의 활성화 상태 : isAlive()
		System.out.printf("%s  %s  %b\n", cc.getName(), cc.getState(), cc.isAlive());
		System.out.println("main end");
		
	}//end main()

}//end class