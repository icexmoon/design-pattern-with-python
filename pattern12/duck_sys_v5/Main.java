package pattern12.duck_sys_v5;

import pattern12.duck_sys_v5.factory.AbsDuckFactory;
import pattern12.duck_sys_v5.factory.NormalDuckFactory;

public class Main {
    public static void main(String[] args) {
        AbsDuckFactory duckFactory = new NormalDuckFactory();
        Ducks ducks = getDucks(duckFactory);
        ducks.quake();
    }

    private static Ducks getDucks(AbsDuckFactory duckFactory) {
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
        return ducks;
    }

}

// MallarDuck quake!!!
// ReadHeadDuck quake!!!
// ToyDuck quake!!!
// MallarDuck quake!!!
// MallarDuck quake!!!