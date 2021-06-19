#######################################################
#
# VeryHotMiniBurger.py
# Python implementation of the Class VeryHotMiniBurger
# Generated by Enterprise Architect
# Created on:      19-6��-2021 18:39:45
# Original author: 70748
#
#######################################################
from .IngredientsFactory import IngredientsFactory
from .Hamburg import Hamburg


class VeryHotMiniBurger(Hamburg):
    def __init__(self, ingredientFactory: IngredientsFactory) -> None:
        super().__init__("Mini Hambruger", ingredientFactory)

    def box(self):
        print("box {}".format(self.name))

    def cook(self):
        print("cook {}".format(self.name))

    def ready(self):
        print("Prepare ingredients")
