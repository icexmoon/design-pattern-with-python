class Coffee:
    def prepare(self):
        self.boilWater()
        self.addTea()
        self.brewing()
        self.addLemon()

    def brewing(self):
        print("brewing")

    def boilWater(self):
        print("boil water")

    def addTea(self):
        print("add tea")

    def addLemon(self):
        print("add lemon")
