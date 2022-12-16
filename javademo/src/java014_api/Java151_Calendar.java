package java014_api;

import java.util.Calendar;

/*
 * 수능일 : 2022-12-17
 * 오늘 : 2022-12-2
 * 남은일 : 16
 */
public class Java151_Calendar {

	public static void main(String[] args) {
		
		Calendar examDay = Calendar.getInstance(); // 수능일에 대한 정의
		int examDay_year = 2022;
		int examDay_month = 12;
		int examDay_date = 17;
		
		examDay.set(examDay_year, examDay_month-1, examDay_date);
		System.out.println(examDay);
		
		
		Calendar toDay = Calendar.getInstance(); // 현재 날짜에 대한 정의
		toDay.set(Calendar.HOUR, 0);
		toDay.set(Calendar.MINUTE, 0);
		toDay.set(Calendar.SECOND, 0);
	    System.out.println(toDay);
	    
	    long eventDay = examDay.getTimeInMillis();
	    long nowDay = toDay.getTimeInMillis();
	    System.out.println("eventDay:" + eventDay);
	    System.out.println("nowDay:" + nowDay);
	    
	    //하루 계산
	    System.out.println(60*60*24*1000);
	    
	    long endDay = (eventDay-nowDay)/(60*60*24*1000);
	    System.out.println("남은 일 :" + endDay); 
	    
	    
	    
	    
	    
		

	}//end main()

}//end class
