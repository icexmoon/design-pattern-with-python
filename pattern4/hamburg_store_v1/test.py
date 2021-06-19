from src.HamburgStore import HamburgStore
from src.Hamburg import Hamburg
store = HamburgStore()
hamburg: Hamburg = store.orderHamburg("mini")
print(hamburg)
hamburg = store.orderHamburg("zinger")
print(hamburg)
hamburg = store.orderHamburg("new_orliean")
print(hamburg)
