from enum import Enum


class TankBody(Enum):
    VT1 = 1
    VT2 = 2
    VT3 = 3
    VT4 = 4


class Tank:
    def __init__(self) -> None:
        self.body:TankBody = TankBody.VT1
        self.hasExtraArmour: bool = False #附加装甲
        self.hasAutomaticWeaponStation: bool = False #自动武器站
        self.hasAirConditioner: bool = False #空调
        self.hasIRCM: bool = False #红外对抗
        self.hasActiveDefence: bool = False #主动防御
    
    def cost(self)->int:
        """坦克报价"""
        price = 0
        if self.body is TankBody.VT1:
            price += 30000
        elif self.body is TankBody.VT2:
            price += 50000
        elif self.body is TankBody.VT3:
            price += 70000
        elif self.body is TankBody.VT4:
            price += 100000
        else:
            pass
        if self.hasExtraArmour:
            price += 10000
        if self.hasAutomaticWeaponStation:
            price += 20000
        if self.hasAirConditioner:
            price += 3000
        if self.hasIRCM:
            price += 30000
        if self.hasActiveDefence:
            price += 35000
        return price

if __name__ == "__main__":
    tank1 = Tank()
    tank1.body = TankBody.VT4
    tank1.hasActiveDefence = True
    tank1.hasAirConditioner = True
    tank1.hasAutomaticWeaponStation = True
    tank1.hasExtraArmour = True
    tank1.hasIRCM = True
    print(tank1.cost())

