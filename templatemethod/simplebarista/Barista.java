package templatemethod.simplebarista;

public class Barista {

	public static void main(String[] args) {
		Tea tea = new Tea();
		System.out.println("Making tea...");
		tea.prepareRecipe();
		
		Coffee coffee = new Coffee();
		System.out.println("Making coffee...");
		coffee.prepareRecipe();
	}
}