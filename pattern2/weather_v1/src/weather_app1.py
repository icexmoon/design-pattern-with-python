#weather_app1.py
from .air_quality import AirQuality,show_air_quality_text

class WeatherApp1:
    def __init__(self) -> None:
        self.temperature: float = 0
        self.humidity: float = 0
        self.airQuality: AirQuality = AirQuality.NORMAL

    def update(self, temperature: float, humidity: float, airQuality: AirQuality):
        '''更新天气信息'''
        self.temperature = temperature
        self.humidity = humidity
        self.airQuality = airQuality
        self.display()

    def display(self) -> None:
        '''显示天气信息'''
        print("="*10)
        print("天气APP1")
        print("现在的气温：{:.2f}摄氏度".format(self.temperature))
        print("现在的湿度{:.2f}".format(self.humidity))
        print("现在的空气质量{}".format(show_air_quality_text(self.airQuality)))
        print("="*10)
