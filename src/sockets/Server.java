package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MBCNEWMAIN on 22.04.2016.
 */
public class Server {
    private Map<InetAddress, String> ipToUserName = new HashMap<>();

    public static void main(String[] a) {
        new Server().start();
    }

    public void start() {
        try (ServerSocket serverSocket = new ServerSocket(3502)) {
            while (true) {
                Socket socket = serverSocket.accept();
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                try {
                    String message = reader.readLine();
                    rememberName(socket, message);

                    String name = getName(socket);

                    System.out.println(name + ": " + message);
                } catch (IOException ignore) {
                }
                reader.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getName(Socket socket) {
        String name = ipToUserName.get(socket.getInetAddress());
        if (name == null) {
            name = "";
        }
        return name;
    }

    private void rememberName(Socket socket, String message) {
        if (message.contains("my name ")) {
            String name = message.replace("my name ", "");
            InetAddress address = socket.getInetAddress();
            ipToUserName.put(address, name);
        }
    }
}
