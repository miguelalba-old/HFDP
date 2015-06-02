package combining.observer;

import java.util.ArrayList;

public class Flock implements Quackable {

	ArrayList<Quackable> ducks = new ArrayList<>();

	public void add(Quackable duck) {
		ducks.add(duck);
	}

	public void quack() {
		for (Quackable duck : ducks) {
			duck.quack();
		}
	}

	public void registerObserver(Observer observer) {
		for (Quackable duck : ducks) {
			duck.registerObserver(observer);
		}
	}

	public void notifyObservers() {
	}

	public String toString() {
		return "Flock of Ducks";
	}
}