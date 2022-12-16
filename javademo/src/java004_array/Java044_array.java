package java004_array;

public class Java044_array {

	public static void main(String[] args) {
		// 3행 2열의 배열
		//int[][] num = {{1,2},{3,4},{5,6}}; // 큰 중괄호는 행의 갯수 3개를 의미하고 중괄호 안의 숫자들의 갯수는 열의 갯수 2개를 의미한다.
		int[][] num = new int [][]{{1,2},{3,4},{5,6}};
		
		for(int row = 0; row < num.length; row++) {
			for(int col = 0; col < num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}
			System.out.println("=======================================================");
			
			System.out.printf("%4d", num[0][1]);
			System.out.printf("%4d", num[1][0]);
			System.out.printf("%4d\n", num[2][0]);
			
			System.out.printf("%4d", num[0][1]);
			System.out.printf("%4d", num[1][1]);
			System.out.printf("%4d\n", num[2][1]);
			
			System.out.println("=======================================================");
			
			for(int col=0; col<=1; col++) {
				for(int row=0; row<=2; row++) {	
				System.out.printf("%4d", num[row][col]);
				}	
				System.out.println();
			
			}
			
			
			
			
			
	}// end main()

}// end class
