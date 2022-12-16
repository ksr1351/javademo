package java020_thread.part02;

/*
 * Runnable interface
 * 1. Runnable 인터페이스에는 run()메소드만 제공한다.
 * 
 */
public class UserImp implements Runnable {
	
	public UserImp() {
		
	}
	 
	@Override
	public void run() {
		for(int i = 0; i <= 5; i++) {
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(),i);
		}
		

	}
	
	
}
