from .drink_machine_status.pop_out import PopOut
from .drink_machine_status.waiting_for_money import WaitingForMoney
from .drink_machine_status.drink_machine_status import DrinkMachineStatus
from .drink_machine_status.sold_out import SoldOut
from .drink_machine_status.has_money import HasMoney


class DrinkMachine:
    def __init__(self) -> None:
        # 加载所有的饮料机状态
        self.WAITING_FOR_MONEY = WaitingForMoney(self)
        self.SOLD_OUT = SoldOut(self)
        self.POP_OUT = PopOut(self)
        self.HAS_MONEY = HasMoney(self)
        # 初始化饮料机
        self.status: DrinkMachineStatus = self.SOLD_OUT
        self.drinkNum: int = 0

    def coin(self):
        self.status.coin()

    def backCoin(self):
        self.status.backCoin()

    def clickBtn(self):
        self.status.clickBtn()

    def addDrink(self, num: int):
        self.status.addDrink(num)
