#######################################################
# 
# VT1.py
# Python implementation of the Class VT1
# Generated by Enterprise Architect
# Created on:      15-6��-2021 14:00:36
# Original author: 70748
# 
#######################################################
from .TankBody import TankBody

class VT1(TankBody):
    def __init__(self) -> None:
        super().__init__()
        self.price = 30000
        self.des = "VT1车体"