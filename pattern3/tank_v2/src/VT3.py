#######################################################
# 
# VT3.py
# Python implementation of the Class VT3
# Generated by Enterprise Architect
# Created on:      15-6��-2021 14:00:36
# Original author: 70748
# 
#######################################################
from .TankBody import TankBody

class VT3(TankBody):
    def __init__(self) -> None:
        super().__init__()
        self.price = 70000
        self.des = "VT3车体"