package decorator.starbuzzsize;

import decorator.starbuzzsize.Beverage.Size;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		// Simple Espresso
		Beverage beverage = new Espresso();
		System.out.printf("%s $%.2f\n", beverage.getDescription(),
				beverage.cost());

		// Double mocha with whip
		beverage = new DarkRoast();
		beverage = new Mocha(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.printf("%s $%.2f\n", beverage.getDescription(),
				beverage.cost());

		// House blend with soy, mocha, and whip
		beverage = new HouseBlend();
		beverage.setSize(Size.VENTI);
		beverage = new Soy(beverage);
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		System.out.printf("%s $%.2f\n", beverage.getDescription(),
				beverage.cost());
	}
}
