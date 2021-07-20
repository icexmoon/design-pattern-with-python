class Tree:
    def __init__(self, x: int, y: int, age: int) -> None:
        self._x = x
        self._y = y
        self._age = age

    def display(self):
        print("draw in screen ({},{}) a tree, age is {}.".format(
            self._x, self._y, self._age))
