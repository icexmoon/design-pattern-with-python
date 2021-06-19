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
# cook Mini Hamburger
# box Mini Hamburger
# MiniBurger
# Prepare ingredients
# cook Mini Hambruger
# box Mini Hambruger
# VeryHotMiniBurger
# Prepare ingredients
# cook Mini Hamburger
# box Mini Hamburger
# NotHotMiniBurger