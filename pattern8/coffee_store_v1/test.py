import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from coffee_store_v1.src.coffee import Coffee
from coffee_store_v1.src.tea import Tea
coffee = Coffee()
tea = Tea()
coffee.prepare()
tea.prepare()
# boil water
# add tea
# brewing
# add lemon
# boil water
# add coffee
# brewing
# add sugger