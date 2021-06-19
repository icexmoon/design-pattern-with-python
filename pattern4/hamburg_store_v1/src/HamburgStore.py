#######################################################
# 
# HamburgStore.py
# Python implementation of the Class HamburgStore
# Generated by Enterprise Architect
# Created on:      19-6��-2021 15:37:37
# Original author: 70748
# 
#######################################################

from .Hamburg import Hamburg
from .ZingerBurger import ZingerBurger
from .MiniBurger import MiniBurger
from .NewOrleansRoastedBurger import NewOrleansRoastedBurger
class HamburgStore:
    def orderHamburg(self, type:str)->Hamburg:
        """点单一个汉堡
        type: 汉堡类型
        """
        hamburg: Hamburg = None
        if type == "zinger":
            hamburg = ZingerBurger()
        elif type == "new_orliean":
            hamburg = NewOrleansRoastedBurger()
        elif type == "mini":
            hamburg = MiniBurger()
        else:
            pass
        if hamburg != None:
            hamburg.ready()
            hamburg.cook()
            hamburg.box()
        return hamburg
