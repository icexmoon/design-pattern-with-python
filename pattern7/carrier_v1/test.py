import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from carrier_v1.src.ClevelandCruiser import ClevelandCruiser
from carrier_v1.src.CarrierAdapter import CarrierAdapter
clevelandCruiser = ClevelandCruiser()
independenceCarrier = CarrierAdapter(clevelandCruiser)
independenceCarrier.takeOffAircraft()
independenceCarrier.recoveryAircraft()
clevelandCruiser.gunFire()
# ClevelandCruiser taking off aircraft
# ClevelandCruiser recovering aircraft
# ClevelandCruiser starting gun fire