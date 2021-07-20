import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from chain.src.File import File
from chain.src.FileClassCollection import FileClassCollection
from chain.src.ClassifyManager import ClassifyManager
manager = ClassifyManager()
collection = FileClassCollection()
for path in os.listdir("D:\\download"):
    filePath = "D:\\download\\{}".format(path)
    if os.path.isfile(filePath):
        manager.classify(File(filePath), collection)
collection.print()
