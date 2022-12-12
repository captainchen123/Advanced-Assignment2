package assignment2;

import java.net.*;
import java.util.Scanner;


public class findHost {
    public static void main(String[] arg){
        try {
            String str = null;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the address：");
            if (scanner.hasNextLine()){
                str = scanner.nextLine();
            }

            InetAddress address = InetAddress.getByName(str);
            System.out.println("\nHost address: " + address.getHostAddress());
            System.out.println("Host name: " + address.getHostName());

        }catch (UnknownHostException ex){
            System.out.println("Could not find address");
        }
    }
}

