from smart_home_v2.src.commnad.Command import Command


class VoiceAssistant:
    def __init__(self) -> None:
        self._voiceCommand: dict[str, Command] = dict()

    def associateVoiceCommand(self, voiceStr: str, command: Command):
        self._voiceCommand[voiceStr] = command

    def say(self, voiceStr: str):
        try:
            command = self._voiceCommand[voiceStr]
        except KeyError:
            print("I don't know")
        else:
            command.execute()
