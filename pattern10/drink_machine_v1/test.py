import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from drink_machine_v1.src.drink_mache import DrinkMachine
drinkMachine = DrinkMachine()
while(True):
    print("="*30)
    print("饮料机支持以下操作：")
    print("1：投币")
    print("2：退币")
    print("3：按动出饮料按钮")
    print("4：打电话给供货商备货")
    print("5：离开饮料机")
    print("="*30)
    option = input()
    if option == '1':
        drinkMachine.coin()
    elif option == '2':
        drinkMachine.backCoin()
    elif option == '3':
        drinkMachine.clickBtn()
    elif option == '4':
        drinkMachine.addDrink(5)
    elif option == '5':
        exit()
    else:
        print("非法操作，请阅读操作指南")
