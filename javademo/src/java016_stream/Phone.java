package java016_stream; //DAY15 [2022.12.05.MON]

import java.io.Serializable;

public class Phone implements Serializable {
	
	String name;
	transient int price; 
	//transient는 객체에 있는 데이터를 저장만 하겠다는 의미이다.
	//출력해보면 가격은 출력되지 않는다.
	//[출력결과] android 0
	
	public Phone() {
	
	}
	
	public Phone(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s %d", name, price);
	}
	
}//end class

