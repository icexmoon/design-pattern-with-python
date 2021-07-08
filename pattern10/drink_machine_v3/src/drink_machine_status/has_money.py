from .drink_machine_status import DrinkMachineStatus
import random


class HasMoney(DrinkMachineStatus):
    def coin(self) -> None:
        print("已经有硬币了，不能重复投币")

    def backCoin(self) -> None:
        print("退还硬币给用户")
        self.drinkMache.status = self.drinkMache.WAITING_FOR_MONEY

    def clickBtn(self) -> None:
        print("用户按下饮料购买按钮")
        if 1 == random.randint(1,10):
            self.drinkMache.status = self.drinkMache.WINNER
        else:
            self.drinkMache.status = self.drinkMache.POP_OUT
        self.drinkMache.status.popOutDrink()

    def popOutDrink(self) -> None:
        print("内部故障，请联系设备制造商")

    def addDrink(self, num: int) -> None:
        print("现在饮料机还有饮料，无需备货")
