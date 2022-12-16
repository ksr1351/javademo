package java020_thread.part04; //DAY19 [2022.12.09.FRI]

public class PriorityTest extends Thread {
	public PriorityTest() {
		
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<=5; i++) {
			System.out.printf("%s  priority=%d   i=%d\n", getName(), getPriority(), i);
		}
		
	}//end run()

}//end PriorityTest class