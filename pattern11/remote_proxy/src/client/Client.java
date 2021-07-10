package pattern11.remote_proxy.src.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import pattern11.remote_proxy.src.RaspbianTVInter;

public class Client {
    public static void runClient(String channelName, String remoteIP) {
        try {
            Registry registry = LocateRegistry.getRegistry(remoteIP, 2002);
            RaspbianTVInter raspbianTVInter = (RaspbianTVInter) registry
                    .lookup("rmi://" + remoteIP + "/" + RaspbianTVInter.RMI_NAME);
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
