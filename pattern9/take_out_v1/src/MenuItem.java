package pattern9.take_out_v1.src;

/**
 * @author 70748
 * @version 1.0
 * @created 05-7��-2021 14:44:27
 */
public class MenuItem {

	private String name = "";
	private double price = 0;
	private boolean vegetarian = false;

	public MenuItem(String name, double price, boolean vegetarian) {
		this.name = name;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void finalize() throws Throwable {

	}

	@Override
	public String toString() {
		String vegetFlag = "否";
		if (this.isVegetarian()) {
			vegetFlag = "是";
		}
		return "菜品名称：" + this.name + "\t价格：" + this.price + "\t是否素菜：" + vegetFlag;
	}
}// end MenuItem