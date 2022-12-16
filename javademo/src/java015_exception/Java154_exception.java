package java015_exception;

public class Java154_exception {
	
	public static void main(String[] args) {
		int[] num = new int[3];
		num[0] = 10;
		System.out.println(num[0]);
		
		//예외 발생 가능성이 있는 곳에 try넣기
		try {
		num[4] = 20;
		}catch(ArrayIndexOutOfBoundsException ex) {
		  //System.out.println(ex.getMessage());
	  	    System.out.println(ex.toString());
		  //ex.printStackTrace();
		}
		
	}//end main()

}//end class
