# weather_app3.py
from .air_quality import AirQuality,show_air_quality_text
class WeatherApp3:
    def __init__(self) -> None:
        self.airQuality: AirQuality = AirQuality.NORMAL

    def update(self, airQuality: AirQuality):
        '''更新天气信息'''
        self.airQuality = airQuality
        self.display()

    def display(self) -> None:
        '''显示天气信息'''
        print("="*10)
        print("天气APP3")
        print("现在的空气质量{}".format(show_air_quality_text(self.airQuality)))
        sportsHint: str = ""
        if self.airQuality in (AirQuality.HEAVEY_POLLUTED, AirQuality.LIGHTLY_POLLUTED):
            sportsHint = "空气质量不好，建议宅家"
        else:
            sportsHint = "空气不错，出去运动一下吧"
        print("运动建议：{}".format(sportsHint))
        print("="*10)
