from enum import Enum
class DrinkMacheStatus(Enum):
    WAITING_FOR_MONEY = 1
    HAS_MONEY = 2
    POP_OUT_DRINK = 3
    SOLD_OUT = 4

