#######################################################
#
# Hamburg.py
# Python implementation of the Class Hamburg
# Generated by Enterprise Architect
# Created on:      19-6��-2021 18:39:44
# Original author: 70748
#
#######################################################

import abc
from .IngredientsFactory import IngredientsFactory


class Hamburg(abc.ABC):
    def __init__(self, name: str, factory: IngredientsFactory) -> None:
        super().__init__()
        self.name: str = name
        self.ingredientFactory: IngredientsFactory = factory

    @abc.abstractmethod
    def box(self):
        pass

    @abc.abstractmethod
    def cook(self):
        pass

    @abc.abstractmethod
    def ready(self):
        pass

    def __repr__(self) -> str:
        return self.__class__.__name__

    def __str__(self) -> str:
        return self.name
