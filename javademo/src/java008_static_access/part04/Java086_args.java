package java008_static_access.part04;

//javac - d (디렉토리 생성) . (현재위치) Java086_arg.java
//java java008_static_access.part04.Java086_args hello world 2022(hello 및 world , 2022값이 args 로 넘어감)
public class Java086_args { //public => 접근제어자
	
	public static void main(String[] args) {
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
		
//		for(int i = 0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		
		for(String data : args) {
			System.out.println(data);
		}
	}//end main()

}//end class
