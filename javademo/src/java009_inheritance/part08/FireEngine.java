package java009_inheritance.part08;

public class FireEngine extends Car{
	private long water;
	
	public FireEngine() {
		
	}
	
	public void setWater(long water) { //setter 메소드
		this.water = water;
	}
	
	void waterSpread() {
		System.out.println(water + "량의 물을 뿌린다.");
	}

}//end class
