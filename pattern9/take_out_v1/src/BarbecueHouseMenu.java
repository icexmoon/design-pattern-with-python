package pattern9.take_out_v1.src;

/**
 * @author 70748
 * @version 1.0
 * @created 05-7��-2021 14:44:27
 */
public class BarbecueHouseMenu {
	private static final int MENU_MAX_NUM = 10;
	private MenuItem[] menuItems;
	private int itemCounter = 0;

	public BarbecueHouseMenu() {
		this.menuItems = new MenuItem[MENU_MAX_NUM];
		try {
			this.addMenuItem(new MenuItem("烤羊肉串", 3, false));
			this.addMenuItem(new MenuItem("烤羊排", 10, false));
			this.addMenuItem(new MenuItem("烤韭菜", 2, true));
			this.addMenuItem(new MenuItem("烤茄子", 5, true));
			this.addMenuItem(new MenuItem("烤土豆", 1, true));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void finalize() throws Throwable {

	}

	public MenuItem[] getMenuItems() {
		return this.menuItems;
	}

	private void addMenuItem(MenuItem menuItem) throws Exception {
		if (this.itemCounter >= MENU_MAX_NUM) {
			throw new Exception("Menu is already full");
		}
		this.menuItems[itemCounter] = menuItem;
		this.itemCounter++;
	}
}// end BarbecueHouseMenu