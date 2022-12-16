package java008_static_access.part03;

public class Java085_static {
	int x = 3;
	static int y = 5; //메소드 영역에 저장됨

	public static void main(String[] args) {
//		System.out.printf("x=d\n", x);
	System.out.printf("x=%d\n", y);

	Java085_static js = new Java085_static();
	js.process(); //비static 내용(int x = 3;) 끌어오려면 위와 같이 객체생성 후 쓰기
	
	display(); 
	
	}// end main()

	public void process() {
		System.out.printf("x=d\n", x);
		System.out.printf("x=%d\n",y);
		System.out.println("process");
	}

	public static void display() {
		System.out.println("display");
	}

}// end class
