package pattern9.take_out_v1.src;

import java.util.ArrayList;

/**
 * @author 70748
 * @version 1.0
 * @created 05-7��-2021 14:44:27
 */
public class BurgerJointMenu {

	private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

	public BurgerJointMenu() {
		this.addMenuItem(new MenuItem("田园鸡腿堡", 15, false));
		this.addMenuItem(new MenuItem("蔬菜沙拉", 10, true));
		this.addMenuItem(new MenuItem("巨无霸", 20, false));
		this.addMenuItem(new MenuItem("薯条", 5, true));
		this.addMenuItem(new MenuItem("可乐", 10, true));
	}

	public void finalize() throws Throwable {

	}

	public ArrayList<MenuItem> getMenuItems() {
		return this.menuItems;
	}

	private void addMenuItem(MenuItem menuItem){
		this.menuItems.add(menuItem);
	}
}// end BurgerJointMenu