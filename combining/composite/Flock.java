package combining.composite;

import java.util.ArrayList;

public class Flock implements Quackable {

	ArrayList<Quackable> quackers = new ArrayList<>();

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	public void quack() {
		for (Quackable quacker : quackers) {
			quacker.quack();
		}
	}

	public String toString() {
		return "Flock of Quackers";
	}
}