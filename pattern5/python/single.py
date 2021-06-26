from typing import Any


class Single:
    def __new__(cls) -> Any:
        if not hasattr(cls, "__instance"):
            setattr(cls, "__instance", super().__new__(cls))
        return getattr(cls, "__instance")

    def showMe(self):
        print("this is a single pattern test")


single1 = Single()
single2 = Single()
print(single1)
print(single2)
print(single1 is single2)
# <__main__.Single object at 0x0000018A9D61A4C0>
# <__main__.Single object at 0x0000018A9D61A4C0>
# True
