#######################################################
# 
# MiDeskLampOnCommand.py
# Python implementation of the Class MiDeskLampOnCommand
# Generated by Enterprise Architect
# Created on:      29-6��-2021 11:26:32
# Original author: 70748
# 
#######################################################
from smart_home_v3.src.MiDeskLamp import MiDeskLamp
from smart_home_v3.src.commnad.Command import Command

class MiDeskLampOnCommand(Command):
    def __init__(self, mideskLamp: MiDeskLamp) -> None:
        super().__init__()
        self._miDeskLamp = mideskLamp
        self._lastBrightness = 0

    def execute(self):
        self._lastBrightness = self._miDeskLamp.getBrightness()
        self._miDeskLamp.setBrightness(50)

    def undo(self) -> None:
        self._miDeskLamp.setBrightness(self._lastBrightness)