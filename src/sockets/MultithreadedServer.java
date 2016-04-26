package sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by MBCNEWMAIN on 26.04.2016.
 */
public class MultithreadedServer {
    private ServerSocket serverSocket;

    public MultithreadedServer() {
        try {
            serverSocket = new ServerSocket(3502);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        try {
            while (true) {
                Socket socket = serverSocket.accept();
                MessageHandler handler = new MessageHandler(socket);
                Thread thread = new Thread(handler);
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + ": created " + thread.getName());
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MultithreadedServer().start();
    }
}
