from collections import namedtuple
Tree = namedtuple("Tree", "x,y,age")


class TreeManager:
    def __init__(self) -> None:
        self._trees = list()

    def addTree(self, x, y, age):
        self._trees.append(Tree(x, y, age))

    def _displayTree(self, x: int, y: int, age: int) -> None:
        print("draw in screen ({},{}) a tree, age is {}.".format(
            x, y, age))

    def display(self):
        tree: Tree
        for tree in self._trees:
            self._displayTree(tree.x, tree.y, tree.age)
