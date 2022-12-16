package java001_basic;

public class Java010_operators {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		// 전위형 : 값이 참조되기 전에 증가시킨다
		j = ++i; // i에 +1 한 후 j 에 할당
		System.out.printf("i=%d, j=%d\n", i, j);
		
		i = 5;
		j = 0;
		
		// 후위형 : 값이 참조된 후 증가시킨다
		j = i++; // i의 값을 j에 먼저 할당 , 그 후 i + 1 
		System.out.printf("i=%d, j=%d\n", i, j);

	}

}
