package combining.composite;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		simulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {

		System.out.println("\nDuck Simulator: With Composite - Flocks");

		Flock flockOfDucks = new Flock();
		flockOfDucks.add(duckFactory.createRedheadDuck());
		flockOfDucks.add(duckFactory.createDuckCall());
		flockOfDucks.add(duckFactory.createRubberDuck());
		flockOfDucks.add(new GooseAdapter(new Goose()));

		Flock flockOfMallards = new Flock();
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());
		flockOfMallards.add(duckFactory.createMallardDuck());

		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);

		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);

		System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() +
			" times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}