import abc


class BaseClass(abc.ABC):
    def mainFunction(self):
        self.__before()
        self.doSomething()
        self.__after()

    def __before(self):
        pass

    def __after(self):
        pass

    @abc.abstractmethod
    def doSomething(self):
        pass
