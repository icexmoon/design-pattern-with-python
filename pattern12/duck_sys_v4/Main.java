package pattern12.duck_sys_v4;

import pattern12.duck_sys_v4.factory.AbsDuckFactory;
import pattern12.duck_sys_v4.factory.CounterDuckFactory;
import pattern12.duck_sys_v4.factory.NormalDuckFactory;

public class Main {
    public static void main(String[] args) {
        AbsDuckFactory duckFactory = new NormalDuckFactory();
        testDucks(duckFactory);
        duckFactory = new CounterDuckFactory();
        testDucks(duckFactory);
    }

    private static void testDucks(AbsDuckFactory duckFactory) {
        Quack duck1 = duckFactory.createMallardDuck();
        Quack duck2 = duckFactory.createReadHeadDuck();
        Quack duck3 = duckFactory.createToyDuck();
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

}

// MallarDuck quake!!!
// ReadHeadDuck quake!!!
// ToyDuck quake!!!
// Goose honk!!!
// quack times is 0
// MallarDuck quake!!!
// ReadHeadDuck quake!!!
// ToyDuck quake!!!
// Goose honk!!!
// quack times is 3