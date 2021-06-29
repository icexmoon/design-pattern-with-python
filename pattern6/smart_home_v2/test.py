import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from smart_home_v2.src.VoiceAssistant import VoiceAssistant
from smart_home_v2.src.commnad.NormalDeskLampOffCommnad import NormalDeskLampOffCommnad
from smart_home_v2.src.commnad.NormalDeskLampOnCommand import NormalDeskLampOnCommand
from smart_home_v2.src.commnad.MiDeskLampOffCommand import MiDeskLampOffCommand
from smart_home_v2.src.commnad.MiDeskLampOnCommand import MiDeskLampOnCommand
from smart_home_v2.src.SmartHomeControl import SmartHomeControl
from smart_home_v2.src.ControlButton import ControlButton
from smart_home_v2.src.NormalDeskLamp import NormalDeskLamp
from smart_home_v2.src.MiDeskLamp import MiDeskLamp
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
voiceAssistant = VoiceAssistant()
voiceAssistant.associateVoiceCommand("open light", openMiDeskLampCommand)
voiceAssistant.associateVoiceCommand("close light", closeMiDeskLampCommand)
voiceAssistant.say("open light")
voiceAssistant.say("close light")
