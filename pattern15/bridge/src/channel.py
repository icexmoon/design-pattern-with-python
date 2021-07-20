from collections import namedtuple
Channel = namedtuple("Channel", "name,des")
NoneChannel = Channel("None", "None")


def channel2str(channel: Channel):
    return "{} ({})".format(channel.name, channel.des)
