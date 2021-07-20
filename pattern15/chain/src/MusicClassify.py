from .FileClass import FileClass
from .FileClassify import FileClassify
from .File import File
from .FileClassCollection import FileClassCollection
class MusicClassify(FileClassify):
    def classify(self, file: File, fileCollection: FileClassCollection) -> bool:
        if file.getExt() in {"mp3"}:
            fileCollection.addFile(file, FileClass.MUSIC)
            return True
        return False