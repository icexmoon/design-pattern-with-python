from src.SichuanHamburgStore import SichuanHamburgStore
from src.BeijingHamburgStore import BeijingHamburgStore
from src.JiangSuHamburgStore import JiangSuHamburgStore
beijingStore = BeijingHamburgStore()
sichuanStore = SichuanHamburgStore()
jiangsuStore = JiangSuHamburgStore()
berger1 = beijingStore.orderHamburg("mini")
print(repr(berger1))
berger2 = sichuanStore.orderHamburg("mini")
print(repr(berger2))
berger3 = jiangsuStore.orderHamburg("mini")
print(repr(berger3))
# Prepare ingredients
# prepare WhiteFeatherChicken
# prepare BeijingPepper
# cook Mini Hamburger
# use WhiteFeatherChicken
# box Mini Hamburger
# MiniBurger
# Prepare ingredients
# prepare ThreeYellowChicken
# prepare SichuanPepper
# cook Mini Hambruger
# use ThreeYellowChicken
# use SichuanPepper
# box Mini Hambruger
# VeryHotMiniBurger
# Prepare ingredients
# prepare BlackChicken
# prepare JiangsuPepper
# cook Mini Hamburger
# use BlackChicken
# use JiangsuPepper
# box Mini Hamburger
# NotHotMiniBurger