package pattern12.duck_sys_v5;

import java.util.ArrayList;
import java.util.List;

public class Ducks implements Quack {
    private List<Quack> quacks = new ArrayList<Quack>();

    public Ducks() {
    }

    public void addQuack(Quack quack) {
        this.quacks.add(quack);
    }

    @Override
    public void quake() {
        for (Quack quack : quacks) {
            quack.quake();
        }
    }

}
