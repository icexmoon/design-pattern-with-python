package pattern9.take_out_v4.src;


/**
 * @author 70748
 * @version 1.0
 * @created 05-7��-2021 14:44:27
 */
public class BarbecueHouseMenu extends Menu {

	public BarbecueHouseMenu() {
		super("barbecue house");
		this.addMenuItem(new MenuItem("烤羊肉串", 3, false));
		this.addMenuItem(new MenuItem("烤羊排", 10, false));
		this.addMenuItem(new MenuItem("烤韭菜", 2, true));
		this.addMenuItem(new MenuItem("烤茄子", 5, true));
		this.addMenuItem(new MenuItem("烤土豆", 1, true));
	}
}// end BarbecueHouseMenu