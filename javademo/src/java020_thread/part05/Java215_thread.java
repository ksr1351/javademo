package java020_thread.part05; //DAY19 [2022.12.09.FRI]

/*
 [동기화] *
 하나의 프로세스에서 여러개의 독립적인 프로그램을 실행할 때 스레드를 사용한다.
 하나의 프로세스를 돌리기 위해 필요한 자원을 스레드가 공유하여 사용할 수 있다는 장점이 있다.

 하지만 a b 스레드가 있고 공유자원이 있을 경우
 a 스레드가 공유자원을 사용하고 있으면 b스레드는 공유자원을 가져다 쓰면 안되기 때문에 접근을 차단하는 동기화가 필요하다.
 어떤 스레드가 공유자원을 사용하고 있으면 다른 스레드가 공유자원을 쓰지 않도록 차단하는 것이 동기화이다.
*/

/*
 * 동기화(synchronized)
 * 
 * 거래은행 => 프로세스
 * 계좌번호 => 공유자원
 * A지점, B지점, C지점  => 스레드
 * 
 * 동기화 : 하나의 스레드가 공유자원을 사용하고 있으면 다른 스레드가 접근하는 것을 막아주는 기능이다.
 *     
 * 동기화 목적 : 데이터의 일관성 유지를 위해서이다.
 * 동기화 키워드 : synchronized
 * 
 * 동기화 설정방법
 * 1) 메소드에 lock을 걸고자 할때
 *    synchronized void openDoor(String name){}    
 * 2) 특정한 객체에 lock을 걸고자 할때
 *    void openDoor(String name){
 *       synchronized(객체의 참조변수){
 *       
 *       }
 *    }
 *
 * wait(), notify(), notifyAll()메소드 동기화가 설정되어 있는 영역에서만 호출 할 수 있다.
 * wait()는 수동으로 notify(), notifyAll()를 사용해야하고
 * sleep()은 어디서든 가능하다.      
 */

public class Java215_thread {

	public static void main(String[] args) {
		Washroom wr = new Washroom(); //공유자원 객체 생성
		
		//Thread 객체 생성
		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "sister");
		FamilyThread brother = new FamilyThread(wr, "brother");
		
		father.start();
		mother.start();
		sister.start();
		brother.start();
		//이렇게만 실행하면 다른 가족 구성원이 퇴장하지 않았음에도 입장하므로
		//가족구성원이 입장했을 경우 퇴장을 마친후에 다른 구성원이 입장 할 수 있도록 구현한다.
		//공유자원에 synchronized를 선언해주면 동기화가 된다.
		
	}//end main()

}//end class
