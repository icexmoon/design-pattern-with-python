#######################################################
#
# ControlButton.py
# Python implementation of the Class ControlButton
# Generated by Enterprise Architect
# Created on:      28-6��-2021 18:03:34
# Original author: 70748
#
#######################################################
from abc import abstractmethod
import abc
from smart_home_v1.src.ButtonStatus import ButtonStatus


class ControlButton(abc.ABC):
    def __init__(self) -> None:
        self.status: ButtonStatus = ButtonStatus.OFF
        self.name: str = self.__class__.__name__
        self.image: str = ""

    @abstractmethod
    def off(self):
        pass

    @abstractmethod
    def on(self):
        pass

    def onClick(self):
        if self.status == ButtonStatus.ON:
            self.off()
            self.status = ButtonStatus.OFF
        elif self.status == ButtonStatus.OFF:
            self.on()
            self.status = ButtonStatus.ON
        else:
            pass

    def onLongPress():
        pass