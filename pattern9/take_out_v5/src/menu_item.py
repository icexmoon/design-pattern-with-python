from .node import Node


class MenuItem(Node):
    def __init__(self, name: str, price: float, vegetarain: bool) -> None:
        super().__init__()
        self.name = name
        self.price = price
        self.vegetarain = vegetarain

    def __str__(self) -> str:
        return "MenuItem({},{},{})".format(self.name, self.price, self.vegetarain)

    def addChild(self, child: "Node"):
        raise Exception("不支持的操作")
