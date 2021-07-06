package pattern9.take_out_v4.src;

/**
 * @author 70748
 * @version 1.0
 * @created 05-7��-2021 14:44:27
 */
public class BurgerJointMenu extends Menu {

	public BurgerJointMenu() {
		super("burger joint");
		this.addMenuItem(new MenuItem("田园鸡腿堡", 15, false));
		this.addMenuItem(new MenuItem("蔬菜沙拉", 10, true));
		this.addMenuItem(new MenuItem("巨无霸", 20, false));
		this.addMenuItem(new MenuItem("薯条", 5, true));
		this.addMenuItem(new MenuItem("可乐", 10, true));
	}

	public static Menu getSpecialMenu() {
		Menu menu = new Menu("Burger Joint's special");
		menu.addMenuItem(new MenuItem("元神全家桶", 50, false));
		menu.addMenuItem(new MenuItem("崩三全家桶", 60, false));
		menu.addMenuItem(new MenuItem("吃鸡全家桶", 70, true));
		return menu;
	}

}// end BurgerJointMenu