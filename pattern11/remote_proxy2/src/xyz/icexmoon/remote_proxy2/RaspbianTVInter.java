package xyz.icexmoon.remote_proxy2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RaspbianTVInter extends Remote {
    public static final String RMI_NAME = "RaspbianTV";
    public Boolean chooseVhannel(String channelName) throws RemoteException;

}
