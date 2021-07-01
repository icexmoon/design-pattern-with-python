import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
sys.path.append(parentDir)
from simple_smart_home.src.SimpleSmartHome import SimpleSmartHome
ssh = SimpleSmartHome()
ssh.watchMovie()
