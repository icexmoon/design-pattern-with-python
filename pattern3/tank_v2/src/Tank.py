#######################################################
# 
# Tank.py
# Python implementation of the Interface Tank
# Generated by Enterprise Architect
# Created on:      15-6��-2021 14:00:36
# Original author: 70748
# 
#######################################################

from abc import ABC, abstractmethod
class Tank(ABC):
    @abstractmethod
    def cost(self):
        pass

    @abstractmethod
    def getDescription(self):
        pass