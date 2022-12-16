package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; //public static final carCount = 5;
	//public CarRun() {}
	//static {System.out.println("CarRun");};
	void prn();  //public abstract
	//void display() {}
	class Sun{ //public static
		public Sun() {
			System.out.println("Sun constructor");
		}
	}
}
