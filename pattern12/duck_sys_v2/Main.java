package pattern12.duck_sys_v2;

import pattern12.duck_sys_v2.duck.MallardDuck;
import pattern12.duck_sys_v2.duck.ReadHeadDuck;
import pattern12.duck_sys_v2.duck.ToyDuck;

public class Main {
    public static void main(String[] args) {
        Quack duck1 = new MallardDuck();
        Quack duck2 = new ReadHeadDuck();
        Quack duck3 = new ToyDuck();
        Quack duck4 = new GooseAdapter(new Goose());
        duckQuack(duck1);
        duckQuack(duck2);
        duckQuack(duck3);
        duckQuack(duck4);
    }

    private static void duckQuack(Quack duck) {
        duck.quake();
    }
}

// MallarDuck quake!!!
// ReadHeadDuck quake!!!
// ToyDuck quake!!!
// Goose honk!!!