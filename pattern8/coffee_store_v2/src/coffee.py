from .hot_drink import HotDrink
class Coffee(HotDrink):
    def _addRawMaterial(self):
        print("add coffee")

    def _addAuxiliary(self):
        print("add sugger")

    def _hasPackage(self) -> bool:
        return True