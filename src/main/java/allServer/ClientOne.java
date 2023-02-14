package allServer;

import java.io.*;
import java.net.Socket;
import util.MenuUtil;


public class ClientOne {
    public static void clientMethod() throws Exception {

        String[] arr = MenuUtil.ipAndPort();
        String userIp = arr[0];
        int userPort = Integer.parseInt(arr[1]);


        Socket firstClient = new Socket(userIp, userPort);
        DataOutputStream outputStream = new DataOutputStream(firstClient.getOutputStream());

        BufferedReader bufferedReader = new BufferedReader(new FileReader("lib/Text.txt"));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            outputStream.write(line.getBytes());

        }
        outputStream.close();
        System.out.println("Message sent successfully");
    }
}


