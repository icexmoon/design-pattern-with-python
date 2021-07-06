import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from take_out_v5.src.menu_factory import MenuFactory
from take_out_v5.src.menu import Menu
bbqMenu = MenuFactory.getBarbecueHouseMenu()
burgerMenu = MenuFactory.getBurgerJointMenu()
allMenu = Menu("all")
allMenu.addSubMenu(bbqMenu)
allMenu.addSubMenu(burgerMenu)
# iter = allMenu.__iter__()
# print(next(iter))
for node in allMenu:
    print(node)
