package pattern12.duck_sys_v6.duck;

import pattern12.duck_sys_v6.Quack;
import pattern12.duck_sys_v6.observer.DuckSubjectHelper;
import pattern12.duck_sys_v6.observer.Observer;
import pattern12.duck_sys_v6.observer.Subject;

/**
 * @author 70748
 * @version 1.0
 * @created 11-7��-2021 11:53:32
 */
public class MallardDuck implements Quack, Subject {
	private DuckSubjectHelper duckSubjectHelper = new DuckSubjectHelper();

	public MallardDuck() {

	}

	public void quake() {
		System.out.println("MallarDuck quake!!!");
		duckSubjectHelper.notifyObsrver(this);
	}

	@Override
	public void registe(Observer observer) {
		duckSubjectHelper.registe(observer);
	}
}// end MallardDuck