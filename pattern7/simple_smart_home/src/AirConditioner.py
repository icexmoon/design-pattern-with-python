#######################################################
#
# AirConditioner.py
# Python implementation of the Class AirConditioner
# Generated by Enterprise Architect
# Created on:      01-7��-2021 11:07:50
# Original author: 70748
#
#######################################################


class AirConditioner:
    def off(self):
        print("{!s} off".format(self))

    def on(self):
        print("{!s} on".format(self))

    def setTemprature(self, temprature: int):
        print("now temprature is {}".format(temprature))

    def __str__(self) -> str:
        return self.__class__.__name__
