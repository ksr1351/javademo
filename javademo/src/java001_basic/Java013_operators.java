package java001_basic;
/*
 * 산술 > 비교 > 논리 > 조건 > 대입
 */

public class Java013_operators {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		
		boolean res;
		
		// && 연산자의 좌변이 false 이면 우변은 수행하지 않는다
		res = (++a > b) && (++b < c); 
		System.out.printf("a=%d, b=%d, c=%d, res=%b\n", a, b, c, res);

		
		int x = 4;
		int y = 8;
		int z = 10;
		
		// || 연산자의 좌변이 true 이면 우변은 수행하지 않는다
		res = (z > ++y) || (++x > y);
		System.out.printf("x=%d, y=%d, z=%d, res=%b\n", x, y, z, res);
		
		
		int k = 1;
		int m = 2;
		int n = 3;
		// 우선순위 : && , ||
		res = k==2 && ++m==2 || n==3 ;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k, m, n, res);
		//k==2 와 ++m==2 를 먼저 비교 , false 여서 k==2 와 n==3  비교		
	
		
		
		k = 1;
		m = 2;
		n = 3;
		res = --k == 2 || m-- == 3 && n == 3;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k, m, n, res);
		// m-- ==3 과 n == 3을 먼저 비교 , false 여서  --k ==2와 비교
		
		
		
		
	}// end main()

}// end class
