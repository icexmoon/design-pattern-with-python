package pattern11.remote_proxy.src;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RaspbianTVInter extends Remote {
    public static final String RMI_NAME = "RaspbianTV";
    public Boolean chooseVhannel(String channelName) throws RemoteException;

}
