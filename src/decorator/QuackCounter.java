package decorator;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberofQuacks;

    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        numberofQuacks++;
    }
    public static int getQuacks() {
        return numberofQuacks;
    }
}
