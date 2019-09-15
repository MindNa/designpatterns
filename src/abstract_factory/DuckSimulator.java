package abstract_factory;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
        AbstractDuckFactory echoAndCountDuckFactory = new EchoAndCountDuckFactory();
        //simulator.simulate(duckFactory);
        //simulator.simulate(countingDuckFactory);
        simulator.simulate(echoAndCountDuckFactory);
    }
    void simulate(AbstractDuckFactory factory) {
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Abstract");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
