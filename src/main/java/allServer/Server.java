package allServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5678);

        while (true) {
            System.out.println("Waiting....\n");
            Socket socket = serverSocket.accept();
            BufferedReader message = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String messageFromClient = message.readLine();
            System.out.println("Message: " + messageFromClient);
        }
    }
}
