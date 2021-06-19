#######################################################
# 
# Hamburg.py
# Python implementation of the Class Hamburg
# Generated by Enterprise Architect
# Created on:      19-6��-2021 15:37:37
# Original author: 70748
# 
#######################################################

from abc import ABC, abstractmethod
class Hamburg(ABC):
    def __init__(self, name:str) -> None:
        """
        name: 汉堡名称
        """
        super().__init__()
        self.name = name

    @abstractmethod
    def box():
        pass

    @abstractmethod
    def ready():
        pass

    @abstractmethod
    def cook():
        pass

    def __str__(self) -> str:
        return self.name