from abc import ABC, abstractmethod


class HotDrink(ABC):
    def prepare(self) -> None:
        self._boilWater()
        self._addRawMaterial()
        self._brewing()
        self._addAuxiliary()
        if self._hasPackage():
            print("package drink")

    def _brewing(self) -> None:
        print("brewing")

    def _boilWater(self) -> None:
        print("boil water")

    @abstractmethod
    def _addRawMaterial(self) -> None:
        pass

    @abstractmethod
    def _addAuxiliary(self) -> None:
        pass

    def _hasPackage(self) -> bool:
        return False
