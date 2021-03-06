#######################################################
#
# FileClassify.py
# Python implementation of the Interface FileClassify
# Generated by Enterprise Architect
# Created on:      20-7��-2021 17:46:52
# Original author: 70748
#
#######################################################
from .FileClassCollection import FileClassCollection
from .File import File
from abc import ABC, abstractmethod


class FileClassify(ABC):
    @abstractmethod
    def classify(self, file: File, fileCollection: FileClassCollection) -> bool:
        pass
