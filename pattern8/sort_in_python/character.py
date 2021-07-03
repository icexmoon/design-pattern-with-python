class Character:
    def __init__(self, name: str, attack: int) -> None:
        self.name = name
        self.attack = attack

    def __str__(self) -> str:
        return "Character({},{})".format(self.name, self.attack)

    def __repr__(self) -> str:
        return self.__str__()
