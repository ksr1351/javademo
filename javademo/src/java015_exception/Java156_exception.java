package java015_exception;

public class Java156_exception {
	
	public static void main(String[] args) {
		
		String data1 = "8";
		String data2 = "0";
		try {
		    int x = Integer.parseInt(data1);
		    int y = Integer.parseInt(data2);
		    int res = x/y;
		    System.out.println(res);
//		}catch(ArithmeticException ex) {
//			System.out.println(ex.toString());
//		}catch(NumberFormatException ex) {
//			System.out.println(ex.toString());
//		}catch(RuntimeException ex) {
//			System.out.println(ex.toString());
		}catch(Exception ex) {  //위의 과정들이 다 귀찮으면 이것만 써도 됨
			System.out.println(ex.toString());
		}
		
	}//end main()

}//end class
