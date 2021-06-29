import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from smart_home_v4.src.VoiceAssistant import VoiceAssistant
from smart_home_v4.src.commnad.NormalDeskLampOffCommnad import NormalDeskLampOffCommnad
from smart_home_v4.src.commnad.NormalDeskLampOnCommand import NormalDeskLampOnCommand
from smart_home_v4.src.commnad.MiDeskLampOffCommand import MiDeskLampOffCommand
from smart_home_v4.src.commnad.MiDeskLampOnCommand import MiDeskLampOnCommand
from smart_home_v4.src.SmartHomeControl import SmartHomeControl
from smart_home_v4.src.ControlButton import ControlButton
from smart_home_v4.src.NormalDeskLamp import NormalDeskLamp
from smart_home_v4.src.MiDeskLamp import MiDeskLamp
from smart_home_v4.src.commnad.MacroCommandFactory import MacroCommandFactory
from smart_home_v4.src.commnad.MacroCommand import MacroCommand
control = SmartHomeControl()
miDeskLamp = MiDeskLamp()
normalDeskLamp = NormalDeskLamp()
openMiDeskLampCommand = MiDeskLampOnCommand(miDeskLamp)
closeMiDeskLampCommand = MiDeskLampOffCommand(miDeskLamp)
miDeskLampBtn = ControlButton(
    "mi desk lamp", (openMiDeskLampCommand, closeMiDeskLampCommand))
normalDeskLampBtn = ControlButton("normal desk lamp", (NormalDeskLampOnCommand(
    normalDeskLamp), NormalDeskLampOffCommnad(normalDeskLamp)))
control.addControlButton(miDeskLampBtn)
control.addControlButton(normalDeskLampBtn)
control.clickButton(0)
control.clickButton(1)
control.clickButton(0)
control.clickButton(1)
backHomeCommand: MacroCommand = MacroCommandFactory.getBackHomeMacroCommand(normalDeskLamp,miDeskLamp)
voiceAssistant = VoiceAssistant()
voiceAssistant.associateVoiceCommand("open light", openMiDeskLampCommand)
voiceAssistant.associateVoiceCommand("close light", closeMiDeskLampCommand)
voiceAssistant.associateVoiceCommand("I'm back", backHomeCommand)
voiceAssistant.say("I'm back")
voiceAssistant.say("undo")
# now mi desk lamp's brightness is 50
# normal desk lamp is turn on
# normal desk lamp is turn off
# now mi desk lamp's brightness is 0
