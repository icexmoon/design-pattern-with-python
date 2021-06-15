class Tank:
    def cost(self)->int:
        return 30000

class AirConditionerEquiped:
    def __init__(self, tank: Tank) -> None:
        self.tank: Tank = tank

    def cost(self)->int:
        return self.tank.cost()+3000

tank1 = AirConditionerEquiped(Tank())
print(tank1.cost())

