package java014_api;

import java.util.Calendar;

public class Java149_Calendar {

	public static void main(String[] args) {
	
		Test tn = Test.getInstance();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		//MONTH는 1월 일 때 0으로 리턴한다.
		int month = cal.get(Calendar.MONTH) +1 ;
		int date = cal.get(Calendar.DATE);
		
		//int hour = cal.get(Calendar.HOUR); //12시간 
		int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
				
				
		System.out.printf("%d-%d-%d %d:%d:%d\n",year,month,date,hour,minute,second);
		
		//이번달의 마지막일 리턴
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		//오늘의 요일 리턴(일요일 => 1 ... 토요일 => 7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		
		//오늘 기준으로 5일전의 날짜로 설정
		cal.add(Calendar.DATE, -5);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1 ;
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d\n",year,month,date);
		
		
		
		//5일전의 날짜의 년도만 바꾸기(2020)
		cal.set(Calendar.YEAR, 2020);
		year = cal.get(Calendar.YEAR);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1 ;
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d\n",year,month,date);
		
		
		//원하는 날짜 선택 후 출력
		cal.set(2022, 1, 1);  //2022.02.01
		cal.set(Calendar.YEAR, 2020);
		year = cal.get(Calendar.YEAR);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) +1 ;
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d\n",year,month,date);
		
		//해당년도 시작일부터 오늘까지의 총 일수
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		
		
		
		
		
		
		
		
	}//end main()

}//end class
