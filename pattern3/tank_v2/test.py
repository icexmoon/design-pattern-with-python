from src.VT1 import VT1
from src.VT4 import VT4
from src.ActiveDefence import ActiveDefence
from src.AirConditioner import AirConditioner
from src.AutomaticWeaponStation import AutomaticWeaponStation
from src.ExtraArmour import ExtraArmour
from src.IRCM import IRCM

print("狗大户可以买这个：")
tank1 = IRCM(ExtraArmour(AutomaticWeaponStation(AirConditioner(ActiveDefence(VT4())))))
print(tank1.getDescription())
print(tank1.cost())
print("性价比可以买这个：")
tank2 = VT1()
tank2 = ExtraArmour(tank2)
tank2 = AutomaticWeaponStation(tank2)
print(tank2.getDescription())
print(tank2.cost())