from .FileClassify import FileClassify
from .File import File
from .FileClassCollection import FileClassCollection
from .FileClass import FileClass
class DocumentClassify(FileClassify):
    def classify(self, file: File, fileCollection: FileClassCollection) -> bool:
        if file.getExt() in {"txt","mobi","pdf","doc","docx"}:
            fileCollection.addFile(file, FileClass.DOCUMENT)
            return True
        return False