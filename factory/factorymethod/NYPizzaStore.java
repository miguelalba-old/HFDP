package factory.factorymethod;

public class NYPizzaStore extends PizzaStore {
	
	Pizza createPizza(String item) {
		switch (item) {
		case "cheese": return new NYStyleCheesePizza();
		case "veggie": return new NYStyleVeggiePizza();
		case "clam": return new NYStyleClamPizza();
		case "pepperoni": return new NYStylePepperoniPizza();
		default: return null;
		}
	}
}
