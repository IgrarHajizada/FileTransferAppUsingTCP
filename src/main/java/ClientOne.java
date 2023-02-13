import java.io.DataOutputStream;
import java.net.Socket;
import java.util.List;

public class ClientOne {
    public static void clientMethod() throws Exception {
        List<Character> message = FileInfoReader.readMessage();

        String[] arr = MenuUtil.ipAndPort();
        String userIp = arr[0];
        int userPort = Integer.parseInt(arr[1]);

        Socket firstClient = new Socket(userIp, userPort);
        DataOutputStream outputStream = new DataOutputStream(firstClient.getOutputStream());
        for (char c: message) {
            outputStream.write(c);
        }
        outputStream.close();

        System.out.println("Message sent successfully");
    }
}

