#######################################################
#
# MiniBurger.py
# Python implementation of the Class MiniBurger
# Generated by Enterprise Architect
# Created on:      19-6��-2021 18:39:45
# Original author: 70748
#
#######################################################
from .Chicken import Chicken
from .Hamburg import Hamburg
from .IngredientsFactory import IngredientsFactory
from .Pepper import Pepper


class MiniBurger(Hamburg):
    def __init__(self, ingredientFactory: IngredientsFactory) -> None:
        super().__init__("Mini Hamburger", ingredientFactory)

    def box(self):
        print("box {}".format(self.name))

    def cook(self):
        print("cook {}".format(self.name))
        print("use {}".format(self.chicken.__class__.__name__))

    def ready(self):
        print("Prepare ingredients")
        chicken: Chicken = self.ingredientFactory.getChicken()
        self.chicken: Chicken = chicken
        self.pepper: Pepper = self.ingredientFactory.getPepper()
        print("prepare {}".format(chicken.__class__.__name__))
        print("prepare {}".format(self.pepper.__class__.__name__))
