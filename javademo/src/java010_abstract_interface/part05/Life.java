package java010_abstract_interface.part05;

// extends ~~~ implements ~~~, ~~~~
// 상속 순서 : 클래스 => 인터페이스
public class Life extends Animal implements SampleA, SampleB{
                 //클래스상속       //인터페이스 상속(구현)
	public Life() {
		System.out.println("Life");
	}

	@Override
	public void call() {
		System.out.println("call");
		
		
	}

	@Override
	public void prn() {
		System.out.println("prn");
		
		
	}
}
