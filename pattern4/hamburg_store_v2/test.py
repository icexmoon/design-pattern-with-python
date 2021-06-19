from src.HamburgStore import HamburgStore
from src.Hamburg import Hamburg
store = HamburgStore()
hamburg: Hamburg = store.orderHamburg("mini")
print(hamburg)
hamburg = store.orderHamburg("zinger")
print(hamburg)
hamburg = store.orderHamburg("new_orliean")
print(hamburg)
# Prepare ingredients
# cook Mini Burger
# box Mini Burger
# Mini Burger
# Prepare ingredients
# cook Zinger Burger
# box Zinger Burger
# Zinger Burger
# Prepare ingredients
# cook New Orleans Roasted Burger
# box New Orleans Roasted Burger
# New Orleans Roasted Burger
