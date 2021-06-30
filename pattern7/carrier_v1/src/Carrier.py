#######################################################
#
# Carrier.py
# Python implementation of the Class Carrier
# Generated by Enterprise Architect
# Created on:      30-6��-2021 15:38:36
# Original author: 70748
#
#######################################################
import abc


class Carrier(abc.ABC):
    @abc.abstractmethod
    def recoveryAircraft(self):
        pass

    @abc.abstractmethod
    def takeOffAircraft(self):
        pass