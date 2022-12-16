package java004_array;

/*
   *   a   b   c   d
   a   *   b   c   d
   a   b   *   c   d
   a   b   c   *   d
   a   b   c   d   *
 */


public class Java049_array {

	public static void main(String[] args) {
		char[][] alpa = new char[][]
				{{'a','b','c','d'},
			     {'a','b','c','d'},
				 {'a','b','c','d'},
				 {'a','b','c','d'}};
		//(규칙)행의 번호와 인덱스의 번호가 같을 때 *가 나옴
		
				 
		for(int i = 0; i < alpa.length; i++) {
			for(int j = 0; j < alpa[i].length; j++) {
				if(i==j) { // 행과 열의 번호가 같으면...
					System.out.printf("%4c",'*');
				}
					System.out.printf("%4c", alpa[i][j]);
				}
			
			System.out.println();
			
			if(i == alpa.length-1) { //행의 번호가 마지막이면
				for(int j = 0; j < alpa[i].length; j++) {
					System.out.printf("%4c",alpa[i][j]);
				}
				System.out.printf("%4c",'*');
			}
		}
		
				 
				 
				 
				 

	}//end main()

}//end class
