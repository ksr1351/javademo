package java009_inheritance.part08;

public class Java009_inheritance {
	
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		fe.setWater(10000);
		fe.setSpeed(100);
		fe.setColor("RED");
		fe.waterSpread();
		//System.out.println(fe.waterSpread()); (x)
		System.out.println(fe.toString());
		
	}//end main()

}//end class
