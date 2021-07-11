package pattern12.duck_sys_v3;

import pattern12.duck_sys_v3.duck.MallardDuck;
import pattern12.duck_sys_v3.duck.ReadHeadDuck;
import pattern12.duck_sys_v3.duck.ToyDuck;

public class Main {
    public static void main(String[] args) {
        Quack duck1 = getQuackCounter(new MallardDuck());
        Quack duck2 = getQuackCounter(new ReadHeadDuck());
        Quack duck3 = getQuackCounter(new ToyDuck());
        Quack duck4 = new GooseAdapter(new Goose());
        duckQuack(duck1);
        duckQuack(duck2);
        duckQuack(duck3);
        duckQuack(duck4);
        System.out.println("quack times is " + QuackCounter.getCounter());
    }

    private static void duckQuack(Quack duck) {
        duck.quake();
    }

    private static QuackCounter getQuackCounter(Quack quack) {
        return new QuackCounter(quack);
    }
}

// MallarDuck quake!!!
// ReadHeadDuck quake!!!
// ToyDuck quake!!!
// Goose honk!!!
// quack times is 3