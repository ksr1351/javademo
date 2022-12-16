package java011_casting.part05;

class ExamA{
	void prn() {}
}

class ExamB extends ExamA{
	void prn() {}
}

class ExamC extends ExamB{
	void prn() {}
}

//////////////////////////////////////////////////////////
//여러클래스들이 있을 땐 main 메소드위의 클래스명으로 저장
public class Java113_instanceof {
	
	public static void main(String[] args) {
		//객체 instanceof 비교 데이터 타입과 같거나 조상 데이터 타입
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA); //true
		
		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB); //false
		
		ExamA ea = new ExamB();
		System.out.println(ea instanceof ExamA); //true
		System.out.println(ea instanceof ExamB); //true
		System.out.println(ea instanceof ExamC); //false
		
	}

}
