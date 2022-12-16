package java009_inheritance.part02;

public class MyChild extends MyFather{
	public MyChild() { //2 자손 생성자에서는 부모 생성자를 호출해야한다.
		super(); // 3 super는 부모를 의미한다.
		
		System.out.println("MyChild"); // 12
	}//13

}
