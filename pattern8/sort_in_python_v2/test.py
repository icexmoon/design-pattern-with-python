from typing import Callable, Sequence
from character import Character


def mySorted(srcSeq: Sequence, key: Callable) -> list:
    if len(srcSeq) <= 1:
        return list(srcSeq)
    i: int
    j: int
    srcList = list(srcSeq)
    for i in range(len(srcList), 0, -1):
        for j in range(1, i, 1):
            x = j-1
            y = j
            itemX = srcList[x]
            itemY = srcList[y]
            if key(itemX) > key(itemY):
                srcList[x] = itemY
                srcList[y] = itemX
    return srcList


characters: list = [Character("lancer", 1), Character(
    "saber", 10), Character("assasin", 0)]
sortedCharacters = mySorted(characters, key=lambda a: a.attack)
print(characters)
print(sortedCharacters)
# [Character(lancer,1), Character(saber,10), Character(assasin,0)]
# [Character(assasin,0), Character(lancer,1), Character(saber,10)]
