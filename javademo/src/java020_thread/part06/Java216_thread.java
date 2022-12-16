package java020_thread.part06; //DAY19 [2022.12.09.FRI]

/* 
 * wait(), notify(), notifyAll()메소드
 */

public class Java216_thread {

	public static void main(String[] args) {

		AccountNumber aNumber = new AccountNumber();
		
		Bank bankA = new Bank(aNumber);
		Thread aPoint = new Thread(bankA, "A지점");
		aPoint.start();
		
		
		Bank bankB = new Bank(aNumber);
		Thread bPoint = new Thread(bankB, "B지점");
		bPoint.start();	
		
	}//end main()

}//end class
