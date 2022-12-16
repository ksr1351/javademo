package java019_inner.part03;

public class OuterLocal {
	private int x;
	static private int y;
	final private int Z = 10;

	public void call(int a) { //메소드의 변수나 지역변수(b)가 있으면 final 써야함
		final int b = 20;
		int c = 30;

		// a = 300;
		// b = 150;
		// c = 400;
		System.out.printf("a=%d\n", a);

		class InnerLocal {
			void prn() {
				x = 5;
				y = 150;

				// 외부 클래스 메소드의 매개변수 또는 지역변수를 이너클래스에서 참조할 때는 final이
				// 선언 된 자원만 참조할 수 있다.
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				System.out.println("c=" + c);
			}// end prn()
		}// end InnerLocal

		InnerLocal inner = new InnerLocal();
		inner.prn();
	}// end call()

}// end OuterLocal
