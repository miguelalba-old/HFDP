package factory.factorymethod;

import java.util.Arrays;

public class NYStyleClamPizza extends Pizza {
	
	public NYStyleClamPizza() {
		name = "NY Style Clam Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		
		toppings.addAll(Arrays.asList("Grated Reggiano Cheese", "Fresh Clams from Long Island Sound"));
	}
}