#######################################################
#
# NewOrleansRoastedBurger.py
# Python implementation of the Class NewOrleansRoastedBurger
# Generated by Enterprise Architect
# Created on:      19-6��-2021 15:37:37
# Original author: 70748
#
#######################################################
from .Hamburg import Hamburg


class NewOrleansRoastedBurger(Hamburg):
    def __init__(self) -> None:
        super().__init__("New Orleans Roasted Burger")

    def box(self):
        print("box {}".format(self.name))

    def ready(self):
        print("Prepare ingredients")

    def cook(self):
        print("cook {}".format(self.name))
