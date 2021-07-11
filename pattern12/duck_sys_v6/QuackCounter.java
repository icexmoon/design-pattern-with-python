package pattern12.duck_sys_v6;

public class QuackCounter implements Quack {
    private static int counter = 0;
    private Quack quack;

    public QuackCounter(Quack quack) {
        this.quack = quack;
    }

    @Override
    public void quake() {
        this.quack.quake();
        QuackCounter.counter++;
    }

    public static int getCounter() {
        return QuackCounter.counter;
    }

}
