from .drink_machine_status import DrinkMachineStatus


class WaitingForMoney(DrinkMachineStatus):
    """待投币状态"""

    def coin(self) -> None:
        print("投入一枚硬币")
        self.drinkMache.status = self.drinkMache.HAS_MONEY

    def backCoin(self) -> None:
        print("现在饮料机中没有硬币，请先投币")

    def clickBtn(self) -> None:
        print("必须先投币才可以买饮料")

    def popOutDrink(self) -> None:
        print("系统错误，请联系设备制造商")

    def addDrink(self, num: int) -> None:
        print("饮料机中有饮料，无需备货")
