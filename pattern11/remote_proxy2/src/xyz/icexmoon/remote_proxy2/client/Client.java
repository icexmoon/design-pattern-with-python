package xyz.icexmoon.remote_proxy2.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import xyz.icexmoon.remote_proxy2.RaspbianTVInter;

public class Client {
    public static void runClient(String channelName, String remoteIP) {
        try {
            System.out.println("choose TV channel " + channelName + " on remote TV " + remoteIP);
            Registry registry = LocateRegistry.getRegistry(remoteIP, 2002);
            RaspbianTVInter raspbianTVInter = (RaspbianTVInter) registry.lookup(RaspbianTVInter.RMI_NAME);
            boolean result = raspbianTVInter.chooseVhannel(channelName);
            if (result) {
                System.out.println("switch channel success");
            }
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NotBoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length <= 0) {
            System.out.println("need channel name");
            return;
        }
        String channelName = args[0];
        String remoteIP = "192.168.1.1";
        Client.runClient(channelName, remoteIP);
    }
}
