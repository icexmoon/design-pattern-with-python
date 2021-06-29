from .MacroCommand import MacroCommand
from .MiDeskLampOnCommand import MiDeskLampOnCommand
from .NormalDeskLampOnCommand import NormalDeskLampOnCommand
from ..NormalDeskLamp import NormalDeskLamp
from ..MiDeskLamp import MiDeskLamp


class MacroCommandFactory:
    @classmethod
    def getBackHomeMacroCommand(cls, normalDeskLamp: NormalDeskLamp, miDeskLamp: MiDeskLamp) -> MacroCommand:
        commands = list()
        commands.append(MiDeskLampOnCommand(miDeskLamp))
        commands.append(NormalDeskLampOnCommand(normalDeskLamp))
        backHomeCommand = MacroCommand(commands)
        return backHomeCommand
