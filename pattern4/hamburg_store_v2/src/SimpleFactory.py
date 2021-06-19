from .Hamburg import Hamburg
from .ZingerBurger import ZingerBurger
from .NewOrleansRoastedBurger import NewOrleansRoastedBurger
from .MiniBurger import MiniBurger
class SimpleFactory:
    @classmethod
    def getHamburg(cls, type:str)->Hamburg:
        hamburg: Hamburg = None
        if type == "zinger":
            hamburg = ZingerBurger()
        elif type == "new_orliean":
            hamburg = NewOrleansRoastedBurger()
        elif type == "mini":
            hamburg = MiniBurger()
        else:
            pass
        return hamburg
