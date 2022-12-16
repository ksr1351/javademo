package java020_thread.part05; //DAY19 [2022.12.09.FRI]

//Thread
public class FamilyThread extends Thread {
	private  Washroom wr;
	private String who;
	
	public FamilyThread() {
	
	}

	public FamilyThread(Washroom wr, String who) {
		this.wr = wr;
		this.who = who;
	}
	
	//Wahroom의 공유자원을 
	@Override
	public void run() {
		wr.openDoor(who);
	}	

}//end FamilyThread class
