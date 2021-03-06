#######################################################
#
# HamburgStore.py
# Python implementation of the Class HamburgStore
# Generated by Enterprise Architect
# Created on:      19-6��-2021 18:39:45
# Original author: 70748
#
#######################################################
from .Hamburg import Hamburg
import abc


class HamburgStore(abc.ABC):
    def orderHamburg(self, type: str) -> Hamburg:
        hamburg: Hamburg = self.creatHamburg(type)
        if hamburg is not None:
            hamburg.ready()
            hamburg.cook()
            hamburg.box()
        return hamburg

    @abc.abstractmethod
    def creatHamburg(self, type: str) -> Hamburg:
        pass
