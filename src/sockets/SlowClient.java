package sockets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by MBCNEWMAIN on 26.04.2016.
 */
public class SlowClient {
    private Socket socket;

    public SlowClient() {
        try {
            socket = new Socket("192.168.1.111", 3502);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        try (PrintWriter writer = new PrintWriter(socket.getOutputStream());
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                String message = scanner.nextLine();
                if (message.equals("exit")) {
                    break;
                }
                writer.print(message);
                //writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Client().start();
    }
}