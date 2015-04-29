package strategy;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
