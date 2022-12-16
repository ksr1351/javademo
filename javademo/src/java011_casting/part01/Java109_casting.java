package java011_casting.part01;

/*자바에서 제공하는 데이터 타입(data type)
 * 1. primitive data type(기본데이터타입) : byte, short, int, long, float, double, boolean, char
 * 2. reference data type(참조데이터타입) :arr, class, interface, enum // 참조데이터
 * 
 * [인자 전달방식]
 * 1. call by value : 값에 의한 복사 - 기본 데이터 타입
 * 	 void add(int a, int b){}
 *   add(10,20);
 * 2. call by reference : 주소에 의한 복사 - 참조 데이터 타입
 * 	  void process(int[] arr){}
 *    process(new int[] {1,2,3});
 *    
 * 형변환(casting) - 기본 데이터 타입
 *1. 묵시적 형변환(자동 형변환): 작 -> 큰
 *2. 명시적 형변환(강제 형변환) : 큰 -> 작
 *   int num = 3;
 *   double data = num; //묵시적 형변환
 *   short val =(short)num;//명시적 형변환
 *
 * 객체형변환 - 참조데이터 타입
 *1. 상속관계일때 형변환이 가능하다.(is a)
 *2 업캐스팅 발생된 후 다운캐스팅을 할 수 있다.
 *  - 업캐스팅(up-casting) :  부모객체로 자식객체를 참조할도록 형변환하는 기술
 *  - 다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술 
 *  
 *   
 *   class 관계
 *   1. is a : 상속관계
 *   2. has a : 포함관계

 */
public class Java109_casting {
	
	public static void main(String[] args) {
		Parent p/*=>변수*/ = new Parent();
		p.process();
		
		Child c = new Child();
		c.process();
		
		//업캐스팅(up-casting)
		Parent pn = c; //is a 관계(상속관계)이기 때문에 가능
		
		//다운캐스팅(down-casting)
		Child cd = (Child)pn;
		cd.call();
		
		//객체 생성 및 업캐스팅
		Parent pt = new Child(); //업캐스팅 발생
		pt.process();
		
		//다운캐스팅
		Child ct = (Child)pt;
		ct.call();
		
	}//end main()

}//end class
