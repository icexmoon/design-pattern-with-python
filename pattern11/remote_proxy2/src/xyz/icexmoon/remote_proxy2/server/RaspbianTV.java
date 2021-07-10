package xyz.icexmoon.remote_proxy2.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import xyz.icexmoon.remote_proxy2.RaspbianTVInter;

public class RaspbianTV extends UnicastRemoteObject implements RaspbianTVInter {

    protected RaspbianTV() throws RemoteException {
        super();
    }

    @Override
    public Boolean chooseVhannel(String channelName) {
        System.out.println("switch to " + channelName + "channel");
        return false;
    }

    public static void runServer(){
        try {
            RaspbianTVInter raspbianTV = new RaspbianTV();
            Registry registry = LocateRegistry.createRegistry(2002);
            registry.rebind(RaspbianTVInter.RMI_NAME, raspbianTV);
            System.out.println("server is ready");
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RaspbianTV.runServer();
    }
}
