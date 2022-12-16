package java018_collection;

public class Average <T extends Number>{ //숫자의 데이터만 제너릭으로 사용
	private T[] list;
	
	public Average() {
		
	}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for(T data : list)
			sum += data.doubleValue();
		return sum/list.length;
	}

}
