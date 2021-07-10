package pattern11.remote_proxy;

import pattern11.remote_proxy.src.client.Client;
import pattern11.remote_proxy.src.server.RaspbianTV;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Need input run mode(client/servere).");
            return;
        }
        String runMode = args[0];
        switch (runMode) {
            case "client":
                if (args.length < 3) {
                    System.out.println("You need input 3 parameters: mode,ip,channel_name");
                    return;
                }
                String remoteIP = args[1];
                String ChannelName = args[2];
                Client.runClient(ChannelName, remoteIP);
                break;
            case "server":
                RaspbianTV.main(args);
                break;
            default:
                System.out.println("The run mode must be client or server.");
                return;
        }
    }
}
