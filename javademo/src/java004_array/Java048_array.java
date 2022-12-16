package java004_array;

public class Java048_array {

	public static void main(String[] args) {
		// 4행 5열
		int[][] num = {{1,2,3,4,5,},
				      {6,7,8,9,10},
				      {11,12,13,14,15},
				      {16,17,18,19,20}};
		
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++ ) {
				if(i % 2 ==0) {
				System.out.printf("%4d",num[i][j]);
			}else {
				System.out.printf("%4d",num[i][num[i].length-1-j]); // 4([num[i].length)는 행에 있는 열의 크기
			}
			
		}
			System.out.println();
	}

}//end main()
}//end class
//행의 인덱스가 홀수인 것들만 역방향으로 진행