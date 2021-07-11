package pattern12.duck_sys_v3.duck;

import pattern12.duck_sys_v3.Quack;

/**
 * @author 70748
 * @version 1.0
 * @created 11-7��-2021 11:53:32
 */
public class ToyDuck implements Quack {

	public ToyDuck(){

	}

	public void quake(){
		System.out.println("ToyDuck quake!!!");
	}
}//end ToyDuck