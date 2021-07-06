package pattern9.take_out_v4.src;

import java.util.Iterator;

/**
 * @author 70748
 * @version 1.0
 * @created 05-7��-2021 14:44:27
 */
public class TakeOutService {
	private BarbecueHouseMenu barbecueHouseMenu;
	private BurgerJointMenu burgerJointMenu;
	private Menu allMenu;

	public TakeOutService() {
		this.allMenu = new Menu("all menu:");
		this.barbecueHouseMenu = new BarbecueHouseMenu();
		this.burgerJointMenu = new BurgerJointMenu();
		this.burgerJointMenu.addChild(BurgerJointMenu.getSpecialMenu());
		this.allMenu.addChild(barbecueHouseMenu);
		this.allMenu.addChild(burgerJointMenu);
	}

	public void printMenu() {
		this.printMenu(this.allMenu);
	}

	private void printMenu(Iterable<Node> iterable) {
		Iterator<Node> iterator = iterable.iterator();
		while (iterator.hasNext()) {
			Node menuItem = iterator.next();
			System.out.println(menuItem);
		}
	}

	public static void main(String[] args) {
		TakeOutService takeOutService = new TakeOutService();
		takeOutService.printMenu();
	}
}// end TakeOutService
// This is a all menu: menu:
// This is a barbecue house menu:
// 菜品名称：烤羊肉串      价格：3.0       是否素菜：否
// 菜品名称：烤羊排        价格：10.0      是否素菜：否
// 菜品名称：烤韭菜        价格：2.0       是否素菜：是
// 菜品名称：烤茄子        价格：5.0       是否素菜：是
// 菜品名称：烤土豆        价格：1.0       是否素菜：是
// This is a burger joint menu:
// 菜品名称：田园鸡腿堡    价格：15.0      是否素菜：否
// 菜品名称：蔬菜沙拉      价格：10.0      是否素菜：是
// 菜品名称：巨无霸        价格：20.0      是否素菜：否
// 菜品名称：薯条  价格：5.0       是否素菜：是
// 菜品名称：可乐  价格：10.0      是否素菜：是
// This is a Burger Joint's special menu:
// 菜品名称：元神全家桶    价格：50.0      是否素菜：否
// 菜品名称：崩三全家桶    价格：60.0      是否素菜：否
// 菜品名称：吃鸡全家桶    价格：70.0      是否素菜：是