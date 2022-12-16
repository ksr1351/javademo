package java002_statements;

public class Java022_switch {

	public static void main(String[] args) {
		//30 : 4, 6, 9, 11
	    //31 : 1, 3, 5, 7, 8, 10, 12
		//28 or 29 : 2

		int year = 2013; //년도
		int month = 2; //월
		int lastDay; //마지막일
		
		if(!(month>=1 && month<=12)) {
			// 1~12월이 아니면 이란 뜻
			System.out.println("1월~12월까지만 가능합니다.");
			return;
			// return은 현재 수행중인 메소드를 빠져나올 때 이용
		}
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;
			
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;
		default:
			//해당 default 는 2월만 받음
			if((year%4==0 && year%100!=0) || year%400==0)
				lastDay=29; //윤년
			else 
				lastDay=28; //평
		}
		
		System.out.printf("%d년도 %d월의 마지막일은 %d입니다.\n", year, month, lastDay);
		
		
		
		
		
		
		
		
	}// end main()

}// end class
