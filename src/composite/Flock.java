package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    static int count = 0;

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    public void quack(){
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()){
            count++;
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
            if (count == 1){
                quacker.quack();
                quacker.quack();
            }
        }
    }
}
