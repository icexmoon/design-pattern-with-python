import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from random import randint
from fly_weight.src.tree_manager import TreeManager
from fly_weight.src.tree import Tree
for i in range(10):
    x = randint(1,1920)
    y = randint(1,1080)
    age = randint(1,200)
    tree = Tree(x,y,age)
    tree.display()
tManager = TreeManager()
for i in range(10):
    x = randint(1, 1920)
    y = randint(1, 1080)
    age = randint(1, 200)
    tManager.addTree(x, y, age)
tManager.display()
