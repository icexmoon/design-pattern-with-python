from abc import ABC, abstractclassmethod


class DrinkMachineStatus(ABC):
    def __init__(self, drinkMachine: "DrinkMachine") -> None:
        super().__init__()
        self.drinkMache: "DrinkMachine" = drinkMachine

    @abstractclassmethod
    def coin(self) -> None:
        """投币"""
        pass

    @abstractclassmethod
    def backCoin(self) -> None:
        """退币"""
        pass

    @abstractclassmethod
    def clickBtn(self) -> None:
        """按动出饮料按钮"""
        pass

    @abstractclassmethod
    def popOutDrink(self) -> None:
        """出饮料，系统内部调用"""
        pass

    @abstractclassmethod
    def addDrink(self, num: int) -> None:
        """添加饮料
        num: 添加的饮料数目
        """
        pass
