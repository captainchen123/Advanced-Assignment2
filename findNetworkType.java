package assignment2;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class findNetworkType {
    public static void main(String[] args){
        try {
            String str = null;
            int cycle = 0;

            Scanner scanner = new Scanner(System.in);

            System.out.println("How many addresses do you want to check：");
            if (scanner.hasNextInt()){
                cycle = scanner.nextInt();
            }else{
                System.out.println("The input is wrong");
            }


            for(int i = 0; i < cycle; i = i+1) {
                System.out.println("Enter the address：");
                str = scanner.next();
                checkType(str);
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("test failed: " + e);
        }
    }

    public static void checkType(String address){
        try{
            InetAddress ipAddress = InetAddress.getByName(address);
            if (ipAddress == null) {
                System.err.println("The address is wrong, for host " + address);
                return;
            }

            if (ipAddress instanceof Inet6Address) {
                System.out.println("This is an IPv6 address.");
            } else if(ipAddress instanceof Inet4Address) {
                System.out.println("This is an IPv4 address.");
            }else {System.out.println("The IP address is of an unknown type.");}

        } catch (UnknownHostException e) {
            System.out.println("Could not find this address");
        }
    }
}
