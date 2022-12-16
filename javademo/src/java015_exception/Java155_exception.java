package java015_exception;

public class Java155_exception {
	
	public static void main(String[] args) {
		StringBuffer sb = null; //StringBuffer(heap) 에 객체가 생성되지 않은 상태, 접근 불가(오류가 뜨는 이유)
		
		try { //일을 저질러 놓고 문제 발생되면 해결함
		sb.reverse();
		}catch(NullPointerException ex) {
			sb = new StringBuffer("java");
			System.out.println(sb);
		}finally {
			System.out.println("program end");
		}
		
		
		
		
	}//end main()

}//end class
