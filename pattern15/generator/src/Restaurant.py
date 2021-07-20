class Restaurant:
    def __init__(self, name: str, price: float, num: int) -> None:
        self._name = name
        self._price = float(price)
        self._num = int(num)

    def __str__(self) -> str:
        total = self._price*self._num
        return "餐馆：{} 人均{:.2f}RMB 预计消费{:.2f}RMB".format(self._name, self._price, total)
