package pattern12.duck_sys_v6;

import java.util.ArrayList;
import java.util.List;

import pattern12.duck_sys_v6.observer.DuckSubjectHelper;
import pattern12.duck_sys_v6.observer.Observer;
import pattern12.duck_sys_v6.observer.Subject;

public class Ducks implements Quack, Subject {
    private List<Quack> quacks = new ArrayList<Quack>();
    private DuckSubjectHelper duckSubjectHelper = new DuckSubjectHelper();

    public Ducks() {
    }

    public void addQuack(Quack quack) {
        this.quacks.add(quack);
    }

    @Override
    public void quake() {
        for (Quack quack : quacks) {
            quack.quake();
        }
        duckSubjectHelper.notifyObsrver(this);
    }

    @Override
    public void registe(Observer observer) {
        duckSubjectHelper.registe(observer);
    }

}
