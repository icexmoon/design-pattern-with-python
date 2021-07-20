

class Hotel:
    def __init__(self, name, roomType, price) -> None:
        super().__init__()
        self._name: str = name
        self._roomType: str = roomType
        self._price: float = float(price)

    def __str__(self) -> str:
        return "酒店：{} {} {:.2f}RMB/晚".format(self._name, self._roomType, self._price)
