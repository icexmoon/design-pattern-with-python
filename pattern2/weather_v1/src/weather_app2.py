#weather_app2.py

class WeatherApp2:
    def __init__(self) -> None:
        self.humidity: float = 0
    
    def update(self, humidity: float):
        '''更新天气信息'''
        self.humidity = humidity
        self.display()

    def display(self) -> None:
        '''显示天气信息'''
        print("="*10)
        print("天气APP2")
        print("现在的湿度{:.2f}".format(self.humidity))
        rainHint: str = ""
        if self.humidity > 10:
            rainHint = "可能要下雨了，请带上雨具"
        else:
            rainHint = "不会下雨，放心出去浪吧"
        print("下雨提示：{}".format(rainHint))
        print("="*10)