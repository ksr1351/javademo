package java016_stream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java164_stream {

	public static void main(String[] args) {
		// 바이트 스트림 (입력 바이트 스트림)
		//InputStream is = System.in;

		// 바이트 스트림과 문자 스트림
		//InputStreamReader ir = new InputStreamReader(is);

		// 문자 스트림
		//BufferedReader br = new BufferedReader(ir);

		//scanner는 읽어올 때만 사용 가능
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("x:");
		x = sc.nextInt();
		
		System.out.print("y:");
		y = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		
		sc.close();
	
	
				
	}// end main()

}// end class
