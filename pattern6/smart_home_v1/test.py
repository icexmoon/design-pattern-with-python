import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from smart_home_v1.src.NormalDeskLampButton import NormalDeskLampButton
from smart_home_v1.src.MiDestkLampButton import MiDestkLampButton
from smart_home_v1.src.NormalDeskLamp import NormalDeskLamp
from smart_home_v1.src.MiDeskLamp import MiDeskLamp
from smart_home_v1.src.SmartHomeControl import SmartHomeControl
control = SmartHomeControl()
miDeskLamp = MiDeskLamp()
normalDeskLamp = NormalDeskLamp()
miDeskLampBtn = MiDestkLampButton(miDeskLamp)
normalDeskLampBtn = NormalDeskLampButton(normalDeskLamp)
control.addControlButton(miDeskLampBtn)
control.addControlButton(normalDeskLampBtn)
control.clickButton(0)
control.clickButton(1)
control.clickButton(0)
control.clickButton(1)
