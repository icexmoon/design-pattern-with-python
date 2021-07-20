#######################################################
# 
# OtherClassify.py
# Python implementation of the Class OtherClassify
# Generated by Enterprise Architect
# Created on:      20-7��-2021 17:46:52
# Original author: 70748
# 
#######################################################
from .FileClassCollection import FileClassCollection
from .File import File
from .FileClassify import FileClassify
from .FileClass import FileClass

class OtherClassify(FileClassify):
    def classify(self, file: File, fileCollection: FileClassCollection) -> bool:
        fileCollection.addFile(file, FileClass.OTHER)
        return True