package java014_api;

abstract public class Test { //추상클래스
	
	abstract public void display() ;
	
	public static TestExam getInstance() {
		return new TestExam();
	}

}


//Test tt = new TestExam();

