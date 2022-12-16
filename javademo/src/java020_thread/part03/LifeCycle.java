package java020_thread.part03; //DAY19 [2022.12.09.FRI]

public class LifeCycle extends Thread {
	
	public LifeCycle() {
	
	}
	
	@Override
	public void run() {
		//현재 thread의 상태값을 알 수 있다 : getState()
		System.out.println(getState());
	}//end run()

}//end class
