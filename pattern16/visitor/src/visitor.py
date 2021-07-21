from .node import Node
from .menu_item import MenuItem
class Visitor:
    def __init__(self, node:Node) -> None:
        self._root = node

    def isHealthyFoods(self)->bool:
        node:Node
        for node in self._root:
            if isinstance(node, MenuItem):
                if not node.vegetarain:
                    return False
        return True