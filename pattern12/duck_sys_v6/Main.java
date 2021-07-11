package pattern12.duck_sys_v6;

import pattern12.duck_sys_v6.duck.MallardDuck;
import pattern12.duck_sys_v6.factory.AbsDuckFactory;
import pattern12.duck_sys_v6.factory.NormalDuckFactory;
import pattern12.duck_sys_v6.observer.DuckObserver;

public class Main {
    public static void main(String[] args) {
        DuckObserver duckObserver = new DuckObserver();
        AbsDuckFactory duckFactory = new NormalDuckFactory();
        Ducks ducks = getDucks(duckFactory, duckObserver);
        ducks.quake();
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.registe(duckObserver);
        mallardDuck.quake();
    }

    private static Ducks getDucks(AbsDuckFactory duckFactory, DuckObserver duckObserver) {
        Quack duck1 = duckFactory.createMallardDuck();
        Quack duck2 = duckFactory.createReadHeadDuck();
        Quack duck3 = duckFactory.createToyDuck();
        Ducks ducks = new Ducks();
        ducks.addQuack(duck1);
        ducks.addQuack(duck2);
        ducks.addQuack(duck3);
        Ducks mallarDucks = new Ducks();
        Quack mDuck1 = duckFactory.createMallardDuck();
        Quack mDuck2 = duckFactory.createMallardDuck();
        Quack mDuck3 = duckFactory.createMallardDuck();
        mallarDucks.addQuack(mDuck1);
        mallarDucks.addQuack(mDuck2);
        mallarDucks.addQuack(mDuck3);
        ducks.addQuack(mallarDucks);
        mallarDucks.registe(duckObserver);
        return ducks;
    }

}

// MallarDuck quake!!!
// ReadHeadDuck quake!!!
// ToyDuck quake!!!
// MallarDuck quake!!!
// MallarDuck quake!!!
// MallarDuck quake!!!
// observed Ducks was quacked
// MallarDuck quake!!!
// observed MallardDuck was quacked