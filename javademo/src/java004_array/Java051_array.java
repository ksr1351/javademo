package java004_array;

/*
 * red
 * green
 * pink
 * (열의 크기가 다름 / 가변배열 사용)
 */
public class Java051_array {

	public static void main(String[] args) {
		char[][] color = new char[][] {{ 'r', 'e', 'd' }, { 'g', 'r', 'e', 'e', 'n' }, { 'p', 'i', 'n', 'k' }};

		for(int i = 0; i < color.length; i++) {
			for(int j = 0 ; j < color[i].length; j++) {
				System.out.printf("%4c", color[i][j]);
			}
			System.out.println();
		}
		System.out.println("========================================");
		for(int i = 0; i < color.length; i ++) {
			System.out.println(color[i]);
		}
		
		
		
	}// end main()

}// end class
