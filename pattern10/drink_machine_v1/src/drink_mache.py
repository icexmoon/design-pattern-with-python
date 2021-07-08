from .drink_mache_status import DrinkMacheStatus


class DrinkMachine:
    def __init__(self) -> None:
        self.status: DrinkMacheStatus = DrinkMacheStatus.SOLD_OUT
        self.drinkNums: int = 0

    def coin(self) -> None:
        """用户投币"""
        if(self.status == DrinkMacheStatus.WAITING_FOR_MONEY):
            print("用户投入一枚硬币")
            self.status = DrinkMacheStatus.HAS_MONEY
        elif self.status == DrinkMacheStatus.HAS_MONEY:
            print("饮料机中已经有硬币了，不能重复投币")
        elif self.status == DrinkMacheStatus.POP_OUT_DRINK:
            print("饮料机正在出饮料，现在不能投币，请耐心等待")
        elif self.status == DrinkMacheStatus.SOLD_OUT:
            print("饮料机已经售罄，请联系供应商备货")
        else:
            print("饮料机正在处理中，目前不能投币，请等待")

    def backCoin(self) -> None:
        """退币操作"""
        if self.status == DrinkMacheStatus.HAS_MONEY:
            print("机器退回一枚硬币")
            self.status = DrinkMacheStatus.WAITING_FOR_MONEY
        else:
            print("饮料机没有硬币，请先投币")

    def clickBtn(self) -> None:
        """按动出饮料按钮"""
        if self.status == DrinkMacheStatus.HAS_MONEY:
            print("饮料机正在出饮料")
            self.status = DrinkMacheStatus.POP_OUT_DRINK
            self.__popDrink()
        elif self.status == DrinkMacheStatus.WAITING_FOR_MONEY:
            print("请先投币")
        elif self.status == DrinkMacheStatus.SOLD_OUT:
            print("饮料机已经售罄，请联系供货商")
        else:
            print("饮料机正在执行其它操作，请等待")

    def __popDrink(self) -> None:
        """出饮料，饮料机内部操作"""
        if self.status == DrinkMacheStatus.POP_OUT_DRINK:
            if self.drinkNums > 0:
                self.drinkNums -= 1
                print("饮料机吐出一瓶饮料")
            if self.drinkNums <= 0:
                self.status = DrinkMacheStatus.SOLD_OUT
                print("已经售罄")
            else:
                self.status = DrinkMacheStatus.WAITING_FOR_MONEY
        else:
            print("内部错误，请联系设备制造商")

    def addDrink(self, drinkNum: int) -> None:
        """装填饮料
        drinkNum: 饮料数目
        """
        if self.status == DrinkMacheStatus.SOLD_OUT:
            print("增加{}瓶饮料".format(drinkNum))
            self.drinkNums = drinkNum
            self.status = DrinkMacheStatus.WAITING_FOR_MONEY
        else:
            print("饮料还有，无需装填")
