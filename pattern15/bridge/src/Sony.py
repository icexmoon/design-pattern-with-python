#######################################################
#
# Sony.py
# Python implementation of the Class Sony
# Generated by Enterprise Architect
# Created on:      20-7��-2021 14:11:12
# Original author: 70748
#
#######################################################
from .TV import TV
from .channel import Channel, NoneChannel, channel2str


class Sony(TV):
    def __init__(self) -> None:
        super().__init__()
        self._name = "Sony"
        self._channels = [Channel("CCTV1", "综合频道"),
                          Channel("CCTV2", "经济频道"),
                          Channel("CCTV5", "体育频道"),
                          Channel("CCTV6", "电影频道"),
                          Channel("CCTV13", "新闻频道")]
        self._currentChannel = NoneChannel

    def getChannelTotal(self) -> int:
        return len(self._channels)

    def setChannel(self, number: int) -> None:
        total: int = self.getChannelTotal()
        if number >= total or number < 0:
            pass
        else:
            self._currentChannel = self._channels[number]
        print("{}电视的当前电视频道为:{}".format(
            self._name, channel2str(self._currentChannel)))        

    def on(self):
        print("{}电视开启".format(self._name))

    def off(self):
        print("{}电视关闭".format(self._name))