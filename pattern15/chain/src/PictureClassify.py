#######################################################
#
# PictureClassify.py
# Python implementation of the Class PictureClassify
# Generated by Enterprise Architect
# Created on:      20-7��-2021 17:46:52
# Original author: 70748
#
#######################################################
from .FileClass import FileClass
from .FileClassCollection import FileClassCollection
from .File import File
from .FileClassify import FileClassify


class PictureClassify(FileClassify):
    def classify(self, file: File, fileCollection: FileClassCollection) -> bool:
        if file.getExt() in {"jpg", "png", "jpeg"}:
            fileCollection.addFile(file, FileClass.PICTURE)
            return True
        return False
