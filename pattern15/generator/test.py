import os
import sys
parentDir = os.path.dirname(__file__)+"\\.."
sys.path.append(parentDir)
from generator.src.Restaurant import Restaurant
from generator.src.Hotel import Hotel
from generator.src.Ticket import Ticket
from generator.src.TripBuilder import TripBuilder
builder = TripBuilder()
builder.buildDay()
builder.addTicket("8:00", Ticket("故宫", 120, 2))
builder.addRestaurant("12:00", Restaurant("北京烤鸭", 80, 2))
builder.addTicket("14:00", Ticket("颐和园", 150, 2))
builder.addRestaurant("18:00", Restaurant("老北京炸酱面", 20, 2))
builder.addHotel("20:00", Hotel("7天", "标准间", 300))
builder.buildDay()
builder.addTicket("8:00", Ticket("天坛", 80, 2))
builder.addRestaurant("12:00", Restaurant("海底捞", 100, 2))
builder.addTicket("14:00", Ticket("长城", 60, 2))
builder.addRestaurant("18:00", Restaurant("小吃一条街", 20, 2))
builder.addHotel("20:00", Hotel("如家", "标准间", 250))
trip = builder.getTrip()
trip.print()