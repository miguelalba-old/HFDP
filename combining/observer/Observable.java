package combining.observer;

import java.util.ArrayList;

public class Observable implements QuackObservable {

	ArrayList<Observer> observers = new ArrayList<>();
	QuackObservable duck;

	public Observable(QuackObservable duck) {
		this.duck = duck;
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(duck);
		}
	}
}