from smart_home_v3.src.commnad.Command import Command
class NoneCommand(Command):
    def execute(self) -> None:
        pass
    def undo(self) -> None:
        pass