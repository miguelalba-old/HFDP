package factory.factorymethod;

import java.util.Arrays;

public class NYStylePepperoniPizza extends Pizza {

	public NYStylePepperoniPizza() {
		name = "NY Style Pepperoni Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";

		toppings.addAll(Arrays.asList("Grated Reggiano Cheese",
				"Sliced Pepperoni", "Garlic", "Onion", "Mushrooms",
				"Red Pepper"));
	}
}
