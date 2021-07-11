package pattern12.duck_sys_v6.observer;

import java.util.ArrayList;
import java.util.List;

import pattern12.duck_sys_v6.Quack;

public class DuckSubjectHelper implements Subject, Observer {
    private List<Observer> observers = new ArrayList<Observer>();

    public DuckSubjectHelper() {
    }

    @Override
    public void notifyObsrver(Quack quack) {
        for (Observer observer : observers) {
            observer.notifyObsrver(quack);
        }
    }

    @Override
    public void registe(Observer observer) {
        observers.add(observer);
    }

}
