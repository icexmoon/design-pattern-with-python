from .Cruiser import Cruiser


class ClevelandCruiser(Cruiser):
    def gunFire(self):
        print("{!r} starting gun fire".format(self))

    def __repr__(self) -> str:
        return self.__class__.__name__

    def __str__(self) -> str:
        return self.__class__.__name__
