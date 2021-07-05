package pattern9.take_out_v1.src;

import java.util.ArrayList;

/**
 * @author 70748
 * @version 1.0
 * @created 05-7��-2021 14:44:27
 */
public class TakeOutService {
	private BarbecueHouseMenu barbecueHouseMenu;
	private BurgerJointMenu burgerJointMenu;

	public TakeOutService() {
		this.barbecueHouseMenu = new BarbecueHouseMenu();
		this.burgerJointMenu = new BurgerJointMenu();
	}

	public void finalize() throws Throwable {

	}

	public void printMenu() {
		System.out.println("This is a Barbecue House menu:");
		MenuItem[] menuItems = this.barbecueHouseMenu.getMenuItems();
		for (int i = 0; i < menuItems.length; i++) {
			if (menuItems[i] != null) {
				System.out.println(menuItems[i]);
			}
		}
		System.out.println("This is a Burger Joint menu:");
		ArrayList<MenuItem> items = this.burgerJointMenu.getMenuItems();
		for (int i=0;i<items.size();i++){
			MenuItem menuItem = items.get(i);
			System.out.println(menuItem);
		}

	}

	public static void main(String[] args) {
		TakeOutService takeOutService = new TakeOutService();
		takeOutService.printMenu();
	}
}// end TakeOutService

// This is a Barbecue House menu:
// 菜品名称：烤羊肉串      价格：3.0       是否素菜：否
// 菜品名称：烤羊排        价格：10.0      是否素菜：否
// 菜品名称：烤韭菜        价格：2.0       是否素菜：是
// 菜品名称：烤茄子        价格：5.0       是否素菜：是
// 菜品名称：烤土豆        价格：1.0       是否素菜：是
// This is a Burger Joint menu:
// 菜品名称：田园鸡腿堡    价格：15.0      是否素菜：否
// 菜品名称：蔬菜沙拉      价格：10.0      是否素菜：是
// 菜品名称：巨无霸        价格：20.0      是否素菜：否
// 菜品名称：薯条  价格：5.0       是否素菜：是
// 菜品名称：可乐  价格：10.0      是否素菜：是