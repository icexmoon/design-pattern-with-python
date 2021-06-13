# weather_sdk.py
from .air_quality import AirQuality
from .weather_app1 import WeatherApp1
from .weather_app2 import WeatherApp2
from .weather_app3 import WeatherApp3


class WeatherSDK:
    def __init__(self) -> None:
        self.temperature: float = 0
        self.humidity: float = 0
        self.airQuality: AirQuality = AirQuality.NORMAL

    def __weatherChanged(self):
        '''天气信息如果改变，此方法会被调用'''
        app1 = WeatherApp1()
        app2 = WeatherApp2()
        app3 = WeatherApp3()
        app1.update(self.temperature, self.humidity, self.airQuality)
        app2.update(self.humidity)
        app3.update(self.airQuality)

    def changeWeatherInfo(self, temperature: float, humidity: float, airQuality: AirQuality) -> None:
        self.temperature = temperature
        self.humidity = humidity
        self.airQuality = airQuality
        self.__weatherChanged()
