from .drink_machine_status import DrinkMachineStatus
class Winner(DrinkMachineStatus):
    def coin(self) -> None:
        print("饮料机正在投放饮料，请稍后再试")

    def backCoin(self) -> None:
        print("饮料机正在投放饮料，请稍后再试")

    def clickBtn(self) -> None:
        print("饮料机正在执行投放饮料操作，请勿重复操作")

    def popOutDrink(self) -> None:
        print("正在出饮料")
        if self.drinkMache.drinkNum > 0:
            self.drinkMache.drinkNum -= 1
            print("吐出一瓶饮料")
        if self.drinkMache.drinkNum > 0:
            self.drinkMache.drinkNum -= 1
            print("吐出一瓶饮料")
        if self.drinkMache.drinkNum > 0:
            self.drinkMache.status = self.drinkMache.WAITING_FOR_MONEY
        else:
            self.drinkMache.status = self.drinkMache.SOLD_OUT

    def addDrink(self, num: int) -> None:
        print("当前饮料机还有饮料，无需备货")