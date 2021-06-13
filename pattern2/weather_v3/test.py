# test.py
from src.WeatherAPP1 import WeatherAPP1
from src.WeatherAPP2 import WeatherAPP2
from src.WeatherAPP3 import WeatherAPP3
from src.WeatherSDK import WeatherSDK
from src.air_quality import AirQuality
sdk = WeatherSDK()
app1 = WeatherAPP1(sdk)
app2 = WeatherAPP2(sdk)
app3 = WeatherAPP3(sdk)
sdk.registeObserver(app1)
sdk.registeObserver(app2)
sdk.registeObserver(app3)
sdk.changeWeatherInfo(1, 2, AirQuality.LIGHTLY_POLLUTED)
# ==========
# 天气APP1
# 现在的气温：1.00摄氏度
# 现在的湿度2.00
# 现在的空气质量轻度污染
# ==========
# ==========
# 天气APP2
# 现在的湿度2.00
# 下雨提示：不会下雨，放心出去浪吧
# ==========
# ==========
# 天气APP3
# 现在的空气质量轻度污染
# 运动建议：空气质量不好，建议宅家
# ==========
