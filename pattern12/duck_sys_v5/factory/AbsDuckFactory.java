package pattern12.duck_sys_v5.factory;

import pattern12.duck_sys_v5.Quack;

public interface AbsDuckFactory {
    public Quack createMallardDuck();
    public Quack createReadHeadDuck();
    public Quack createToyDuck();
}
