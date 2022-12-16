package java001_basic;

public class Java004_casting {

	public static void main(String[] args) {
		byte bNum = 2; // -128 ~ 127
		short sNum = 4; // -32,768 ~ 32,767
		int xNum = 5;
		long lNum = 6L; // L or l
		float fNum = 2.5F;  // F or f
		double dNum = 7.4;
		char cData = 'a';
		boolean eNum = true;  // true or false (무조건 소문자)
		// int 이하(byte,short)인 것들은 타입에 맞춰서 저장이 됨
		// 문자 인식은 홑따옴표 쓰기
		
		System.out.println(lNum);
		System.out.println(fNum);
		
		//형변환(casting)
		//1. 묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생(자동)
		//2. 명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생(강제)
		long gNum = 6; //묵시적 형변환 : long <= int
		
		float tNum = (float)2.6; //명시적 형변환 : float <= double 
		
		//큰 데이터를 작은 데이터로 변환할 때 데이터 소실되지 않도록 주의
		
		//데이터 소실이 발생되는 경우
		byte data =(byte)128;
		System.out.println(data); //-128
		
	
				
	}// end main()
}// end class
