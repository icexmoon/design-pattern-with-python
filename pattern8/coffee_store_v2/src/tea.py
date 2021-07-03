from .hot_drink import HotDrink
class Tea(HotDrink):
    def _addAuxiliary(self) -> None:
        print("add lemon")

    def _addRawMaterial(self) -> None:
        print("add tea")

    def _hasPackage(self) -> bool:
        return False