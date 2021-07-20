#######################################################
#
# ClassifyManager.py
# Python implementation of the Class ClassifyManager
# Generated by Enterprise Architect
# Created on:      20-7��-2021 17:46:51
# Original author: 70748
#
#######################################################
from .DocumentClassify import DocumentClassify
from .MusicClassify import MusicClassify
from .OtherClassify import OtherClassify
from .PictureClassify import PictureClassify
from .VedioClassify import VedioClassify
from .FileClassCollection import FileClassCollection
from .File import File
from .FileClassify import FileClassify


class ClassifyManager(FileClassify):
    def __init__(self) -> None:
        super().__init__()
        self._classifies: list[FileClassify] = list()
        self._initClassifies()

    def classify(self, file: File, fileCollection: FileClassCollection) -> bool:
        classify: FileClassify
        for classify in self._classifies:
            if classify.classify(file, fileCollection):
                break
        return True

    def _initClassifies(self):
        self._classifies.append(MusicClassify())
        self._classifies.append(DocumentClassify())
        self._classifies.append(VedioClassify())
        self._classifies.append(PictureClassify())
        self._classifies.append(OtherClassify())
