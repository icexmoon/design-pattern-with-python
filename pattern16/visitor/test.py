import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from visitor.src.menu_factory import MenuFactory
from visitor.src.visitor import Visitor
menu = MenuFactory.getBarbecueHouseMenu()
for node in menu:
    healthyFlag: str = ""
    if (Visitor(node).isHealthyFoods()):
        healthyFlag = "健康食物"
    else:
        healthyFlag = "不健康食物"
    print("{!s} [{}]".format(node, healthyFlag))
