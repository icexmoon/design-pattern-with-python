from collections.abc import Iterator


class Node():
    def __init__(self) -> None:
        self.children: list = list()
        self.parent: Node = None

    def removeFromParent(self) -> bool:
        if self.parent is not None:
            return self.parent.removeChild(self)
        return False

    def removeChild(self, child: "Node") -> bool:
        self.children.remove(child)
        child.parent = None
        return True

    def addChild(self, child: "Node"):
        self.children.append(child)
        child.parent = self

    def isLeaf(self):
        if len(self.children) == 0:
            return True
        return False

    def getChildren(self) -> list:
        return self.children

    def __iter__(self) -> Iterator:
        yield self
        if self.isLeaf():
            return
        #对子节点进行遍历
        childNode: "Node"
        for childNode in self.getChildren():
            yield from childNode.__iter__()
