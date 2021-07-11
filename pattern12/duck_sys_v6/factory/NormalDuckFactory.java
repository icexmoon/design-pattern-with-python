package pattern12.duck_sys_v6.factory;

import pattern12.duck_sys_v6.Quack;
import pattern12.duck_sys_v6.duck.MallardDuck;
import pattern12.duck_sys_v6.duck.ReadHeadDuck;
import pattern12.duck_sys_v6.duck.ToyDuck;

public class NormalDuckFactory implements AbsDuckFactory {

    @Override
    public Quack createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quack createReadHeadDuck() {
        return new ReadHeadDuck();
    }

    @Override
    public Quack createToyDuck() {
        return new ToyDuck();
    }

}
