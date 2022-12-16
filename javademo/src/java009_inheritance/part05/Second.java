package java009_inheritance.part05;

// import java009_inheritance.part05.First
// import java.lang.System; (같은 패키지 안에 있는 패키지 사용 시 import 생략 가능)  
// import java.lang.Override;


public class Second extends First{ //First에서 상속을 받는다. (같은 패키지니까 default여도 상속 가능)
	int b = 20;
	
	@Override // 틀린 부분을 찾아주는 역할
	void display() { //현재 default 이지만 protected, public 사용 가능
		System.out.println("b="+ b); //override
	}
	void superThisMethod() {
		super.display();
		this.display(); //this 생략 가능, 알아서 붙여지게 됨
	}

}
