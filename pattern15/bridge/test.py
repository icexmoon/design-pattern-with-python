import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from bridge.src.NumberControl import NumberControl
from bridge.src.Sony import Sony
control = NumberControl(Sony())
control.on()
control.switchChannel(2)
control.nextChannel()
control.lastChannel()
control.off()