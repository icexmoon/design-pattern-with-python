from .drink_machine_status import DrinkMachineStatus


class SoldOut(DrinkMachineStatus):
    """售罄状态"""

    def coin(self) -> None:
        print("饮料已经售罄，无法投币，请联系供应商备货")

    def backCoin(self) -> None:
        print("目前饮料机没有硬币可以退还，请先投币")

    def clickBtn(self) -> None:
        print("饮料已经售罄，请联系供应商备货")

    def popOutDrink(self) -> None:
        print("系统错误，请联系设备制造商")

    def addDrink(self, num: int) -> None:
        if num > 0:
            self.drinkMache.drinkNum = num
            print("增加{}瓶饮料".format(num))
            self.drinkMache.status = self.drinkMache.WAITING_FOR_MONEY
