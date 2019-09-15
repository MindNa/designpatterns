package composite;

public class QuackEcho implements Quackable {
    Quackable duck;

    public QuackEcho(Quackable duck){
        this.duck = duck;
    }
    public void quack(){
        duck.quack();
        echo();
        duck.quack();
    }
    public void echo(){
        System.out.println("Echo: ");
    }
}
