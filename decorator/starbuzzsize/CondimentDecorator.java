package decorator.starbuzzsize;

public abstract class CondimentDecorator extends Beverage {

	public Beverage beverage;
	
	public abstract String getDescription();
	
	public Size getSize() {
		return beverage.getSize();
	}
}