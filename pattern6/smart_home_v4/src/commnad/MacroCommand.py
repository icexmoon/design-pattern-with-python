from typing import Sequence
from .Command import Command


class MacroCommand(Command):
    def __init__(self, commands: Sequence[Command]) -> None:
        super().__init__()
        self._commands: list[Command] = list(commands)

    def execute(self) -> None:
        command: Command
        for command in self._commands:
            command.execute()

    def undo(self) -> None:
        command: Command
        for command in reversed(self._commands):
            command.undo()
