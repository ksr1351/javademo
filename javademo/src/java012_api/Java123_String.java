package java012_api;

/*
 * [출력결과]
 * 박상원님은 남성입니다.
 * 김연아님은 여성입니다.
 * 잘못입력하셨습니다.
 */
public class Java123_String {
	
	public static void main(String[] args) { //1. 이름 및 주민등록번호 분리
		String p1 = "박상원,561203-1597650";   //2. 성별을 구분해주는 문자를 가지고 오기
		String p2 = "김연아,030628-4056892";   //3. 1,3 남성 / 2,4 여성 / 만족하지 않으면 나머지
		String p3 = "정해인,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
		
	}//end main()
	
	public static void display(String str) {
		//여기를 구현하세요
		
		String[] data = str.split(",");
		//System.out.printf("data[0]=%s, data[1]=%s\n", data[0], data[1]);
		
		char gen = data[1].charAt(7); // '561203-1597650'.charAt(7) => '1'
		if(gen=='1' || gen=='3')
			System.out.printf("%s님은 %c성입니다.\n",data[0],'남');
		else if(gen=='2'|| gen=='4')
			System.out.printf("%s님은 %c성입니다.\n",data[0],'여');
		else
			System.out.println("잘못입력하셨습니다.");
		

		
	}//end display()

}//end class
