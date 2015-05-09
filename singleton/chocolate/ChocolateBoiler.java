package singleton.chocolate;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of Chocolate Boiler");
			uniqueInstance = new ChocolateBoiler();
		}
		System.out.println("Returning instance of Chocolate Boiler");
		return uniqueInstance;
	}
	
	public void fill() {
		if (empty) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
	
	public void drain() {
		if (!empty && !boiled) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}

	public void boil() {
		if (!empty && !boiled) {
			// bring the contents to a boil
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
