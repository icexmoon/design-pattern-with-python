class Tea:
    def prepare(self):
        self.boilWater()
        self.addCoffee()
        self.brewing()
        self.addSugger()

    def brewing(self):
        print("brewing")

    def boilWater(self):
        print("boil water")

    def addCoffee(self):
        print("add coffee")

    def addSugger(self):
        print("add sugger")