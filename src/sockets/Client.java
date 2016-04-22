package sockets;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by MBCNEWMAIN on 22.04.2016.
 */
public class Client {
    public static void main(String[] args) {
        new Client().start();
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String message = scanner.next();
            if (message.equals("exit")) {
                break;
            }
            send(message);
        }
    }

    private void send(String message) {
        try (Socket socket = new Socket("192.168.1.111", 3502);
             PrintWriter writer = new PrintWriter(socket.getOutputStream())) {

            writer.print(message);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
