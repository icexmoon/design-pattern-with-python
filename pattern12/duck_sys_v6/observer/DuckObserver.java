package pattern12.duck_sys_v6.observer;

import pattern12.duck_sys_v6.Quack;

public class DuckObserver implements Observer {

    @Override
    public void notifyObsrver(Quack quack) {
        System.out.println("observed " + quack.getClass().getSimpleName() + " was quacked");
    }
}
