package factory.factorymethod;

import java.util.Arrays;

public class NYStyleVeggiePizza extends Pizza {

	public NYStyleVeggiePizza() {
		name = "NY Style Veggie Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.addAll(Arrays.asList("Grated Reggiano Cheese", "Garlic",
				"Onion", "Mushrooms", "Red Pepper"));
	}
}
