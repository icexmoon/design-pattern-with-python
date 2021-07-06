from .menu import Menu
from .menu_item import MenuItem


class MenuFactory:
    @classmethod
    def getBarbecueHouseMenu(cls) -> Menu:
        menu: Menu = Menu("Barbecue House")
        menu.addMenuItem(MenuItem("烤羊肉串", 3, False))
        menu.addMenuItem(MenuItem("烤羊排", 3, False))
        menu.addMenuItem(MenuItem("烤韭菜", 3, False))
        menu.addMenuItem(MenuItem("烤茄子", 3, False))
        menu.addMenuItem(MenuItem("烤土豆", 3, False))
        return menu

    @classmethod
    def getBurgerJointMenu(cls) -> Menu:
        menu: Menu = Menu("Burger Joint")
        menu.addMenuItem(MenuItem("田园鸡腿堡", 15, False))
        menu.addMenuItem(MenuItem("蔬菜沙拉", 15, False))
        menu.addMenuItem(MenuItem("巨无霸", 15, False))
        menu.addMenuItem(MenuItem("薯条", 15, False))
        menu.addMenuItem(MenuItem("可乐", 15, False))
        specialMenu = Menu("Burger Joint's special")
        specialMenu.addMenuItem(MenuItem("元神全家桶", 50, False))
        specialMenu.addMenuItem(MenuItem("崩三全家桶", 50, False))
        specialMenu.addMenuItem(MenuItem("吃鸡全家桶", 50, False))
        menu.addSubMenu(specialMenu)
        return menu
