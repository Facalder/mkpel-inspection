import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();

		String currentCountText = "Current count:";
		
		System.out.println(currentCountText + counter.getCount());
		
		counter.increment();
		
		System.out.println(currentCountText + counter.getCount());
		
		counter.decrement();
		
		System.out.println(currentCountText + counter.getCount());
		
	}

}
