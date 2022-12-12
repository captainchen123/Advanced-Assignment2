//package assignment2;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class findLocalHost {
    public static void main(String[] args){
        try{
            InetAddress localHost = InetAddress.getLocalHost();

            String ipAddress = localHost.getHostAddress();
            String ipHostName = localHost.getHostName();
            String ipCanonicalHostName = localHost.getCanonicalHostName();



            System.out.println("\nThe IP address of the local machine is: " + ipAddress);
            System.out.println("Host name is: " + ipHostName);
            System.out.println("Canonical Host name is: " + ipCanonicalHostName);


        }catch(UnknownHostException e){
            System.out.println("Could not find the Local address");
        }
    }
}
