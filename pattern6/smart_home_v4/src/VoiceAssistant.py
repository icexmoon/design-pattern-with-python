from smart_home_v4.src.commnad.Command import Command
from smart_home_v4.src.commnad.NoneCommand import Command, NoneCommand
from .NormalDeskLamp import NormalDeskLamp
from .MiDeskLamp import MiDeskLamp


class VoiceAssistant:
    def __init__(self) -> None:
        self._voiceCommand: dict[str, Command] = dict()
        self._lastCommand: Command = NoneCommand()

    def associateVoiceCommand(self, voiceStr: str, command: Command):
        self._voiceCommand[voiceStr] = command

    def say(self, voiceStr: str) -> None:
        if voiceStr == "undo":
            self._lastCommand.undo()
            return
        try:
            command = self._voiceCommand[voiceStr]
        except KeyError:
            print("I don't know")
        else:
            self._lastCommand = command
            command.execute()
