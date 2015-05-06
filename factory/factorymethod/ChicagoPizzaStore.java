package factory.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		switch (item) {
		case "cheese":
			return new ChicagoStyleCheesePizza();
		case "veggie":
			return new ChicagoStyleVeggiePizza();
		case "clam":
			return new ChicagoStyleClamPizza();
		case "pepperoni":
			return new ChicagoStylePepperoniPizza();
		default:
			return null;
		}
	}

}
