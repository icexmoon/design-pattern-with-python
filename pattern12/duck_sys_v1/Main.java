package pattern12.duck_sys_v1;

import pattern12.duck_sys_v1.duck.MallardDuck;
import pattern12.duck_sys_v1.duck.ReadHeadDuck;
import pattern12.duck_sys_v1.duck.ToyDuck;

public class Main {
    public static void main(String[] args) {
        Quack duck1 = new MallardDuck();
        Quack duck2 = new ReadHeadDuck();
        Quack duck3 = new ToyDuck();
        duckQuack(duck1);
        duckQuack(duck2);
        duckQuack(duck3);
    }

    private static void duckQuack(Quack duck) {
        duck.quake();
    }
}

// MallarDuck quake!!!
// ReadHeadDuck quake!!!
// ToyDuck quake!!!