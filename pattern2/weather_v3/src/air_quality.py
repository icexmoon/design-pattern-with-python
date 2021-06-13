# weather_quality.py
from enum import Enum, unique


@unique
class AirQuality(Enum):
    EXCELLENT = 1
    GOODE = 2
    NORMAL = 3
    LIGHTLY_POLLUTED = 4
    HEAVEY_POLLUTED = 5

def show_air_quality_text(airQuality: AirQuality) -> str:
    text: str = ''
    if airQuality == AirQuality.EXCELLENT:
        text = '优秀'
    elif airQuality == AirQuality.GOODE:
        text = '良好'
    elif airQuality == AirQuality.NORMAL:
        text = '一般'
    elif airQuality == AirQuality.LIGHTLY_POLLUTED:
        text = '轻度污染'
    elif airQuality == AirQuality.HEAVEY_POLLUTED:
        text = '重度污染'
    else:
        text = '未定义的空气质量'
    return text