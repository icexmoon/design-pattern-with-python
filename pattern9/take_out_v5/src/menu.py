from .node import Node
from .menu_item import MenuItem


class Menu(Node):
    def __init__(self, name: str) -> None:
        super().__init__()
        self.name = name

    def __str__(self) -> str:
        return "the {} menu is:".format(self.name)

    def addMenuItem(self, menuItem: MenuItem):
        self.addChild(menuItem)

    def addSubMenu(self, menu: "Menu"):
        self.addChild(menu)

