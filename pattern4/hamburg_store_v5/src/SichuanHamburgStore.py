#######################################################
#
# SichuanHamburgStore.py
# Python implementation of the Class SichuanHamburgStore
# Generated by Enterprise Architect
# Created on:      19-6��-2021 18:39:45
# Original author: 70748
#
#######################################################
from .SichuanIngredientsFactory import SichuanIngredientsFactory
from .Hamburg import Hamburg
from .HamburgStore import HamburgStore
from .VeryHotMiniBurger import VeryHotMiniBurger
from .VeryHotNewOrleansRoastedBurger import VeryHotNewOrleansRoastedBurger
from .VeryHotZingerBurger import VeryHotZingerBurger


class SichuanHamburgStore(HamburgStore):
    def creatHamburg(self, type: str) -> Hamburg:
        hamburg: Hamburg = None
        factory = SichuanIngredientsFactory()
        if type == "zinger":
            hamburg = VeryHotZingerBurger(factory)
        elif type == "new_orliean":
            hamburg = VeryHotNewOrleansRoastedBurger(factory)
        elif type == "mini":
            hamburg = VeryHotMiniBurger(factory)
        else:
            pass
        return hamburg
