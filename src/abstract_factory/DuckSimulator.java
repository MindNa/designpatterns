package abstract_factory;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        //AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate();
        //simulator.simulate(duckFactory);
    }
    void simulate() {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable goose = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Decorator");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);
        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }
//    void simulate(AbstractDuckFactory duckFactory) {
//        Quackable mallardDuck = duckFactory.createMallardDuck();
//        Quackable redheadDuck = duckFactory.createRedheadDuck();
//        Quackable duckCall = duckFactory.createDuckCall();
//        Quackable rubberDuck = duckFactory.createRubberDuck();
//        Quackable goose = new GooseAdapter(new Goose());
//        Quackable pigeon = new PigeonAdapter(new Pigeon());
//
//        System.out.println("\nDuck Simulator: With Decorator");
//
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(goose);
//        simulate(pigeon);
//
//        System.out.println("The ducks quacked " +
//                QuackCounter.getQuacks() + " times");
//    }
    void simulate(Quackable duck) {
        duck.quack();
    }
}
