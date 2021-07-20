from typing import Any
from .TripItem import TripItem


class Day:
    def __init__(self) -> None:
        self._tripItems = list()

    def addTripItem(self, time: str, item: Any):
        self._tripItems.append(TripItem(time, item))

    def print(self):
        item: TripItem
        for item in self._tripItems:
            print("{} {!s}".format(item.time, item.item))
