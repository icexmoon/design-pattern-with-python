#######################################################
#
# RemoteControl.py
# Python implementation of the Class RemoteControl
# Generated by Enterprise Architect
# Created on:      20-7��-2021 14:11:11
# Original author: 70748
#
#######################################################
from abc import ABC, abstractmethod
from .TV import TV


class RemoteControl(ABC):
    def __init__(self, tv: TV) -> None:
        super().__init__()
        self._tv: TV = tv

    @abstractmethod
    def lastChannel():
        pass

    @abstractmethod
    def nextChannel():
        pass

    @abstractmethod
    def off():
        pass

    @abstractmethod
    def on():
        pass
