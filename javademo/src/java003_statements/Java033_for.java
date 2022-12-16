package java003_statements;

/* 
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올 때(break)
 * 반복문에서 label을 선언하고 호출하면 된다.
 */
public class Java033_for {

	public static void main(String[] args) {
		
		for(int k = 1; k<5; k++) {
			move: //lable선언(임의로 지정)
			for(int i = 1; i <= 3; i++) {
				go: // label선언(임의로 지정)
				for(int j = 1; j<=2; j++) {
					System.out.printf("j=%d\n", i);
					//break;
					//break go;
					//break move;
					continue move; // continue는 조건식으로 이동 (지정된 레이블로)
				}
				System.out.printf("i=%d\n", i);
				
			}
			System.out.printf("kkk");
		}
		System.out.println("program end");
		
		
	}//end main()

}//end class
