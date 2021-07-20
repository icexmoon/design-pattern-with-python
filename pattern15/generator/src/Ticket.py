class Ticket:
    def __init__(self, name: str, price: float, num: int) -> None:
        self._name: str = name
        self._price: float = price
        self._num: int = int(num)

    def __str__(self) -> str:
        total = self._price*self._num
        return "门票：{} {:.2f}RMB/人 共{}张 合计{:.2f}RMB".format(self._name, self._price, self._num, total)
