from src.weather_sdk import WeatherSDK, AirQuality
sdk = WeatherSDK()
sdk.changeWeatherInfo(1, 2, AirQuality.HEAVEY_POLLUTED)
# ==========
# 天气APP1
# 现在的气温：1.00摄氏度
# 现在的湿度2.00
# 现在的空气质量重度污染
# ==========
# ==========
# 天气APP2
# 现在的湿度2.00
# 下雨提示：不会下雨，放心出去浪吧
# ==========
# ==========
# 天气APP3
# 现在的空气质量重度污染
# 运动建议：空气质量不好，建议宅家
# ==========