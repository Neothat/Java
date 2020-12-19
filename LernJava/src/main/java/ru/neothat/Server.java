package ru.neothat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static final int DEFAULT_PORT = 8189;

    public static void main(String[] args) throws IOException {
        new Server().start(DEFAULT_PORT);
    }

    private void start(int port) throws IOException{
        ServerSocket socket = null;
        Socket clientSocket = null;
        Thread inputThread = null;

        try {
            socket = new ServerSocket(port);
            System.out.println("Сервер запущен");
            clientSocket = socket.accept();
            System.out.println("Клиент подключился");
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            inputThread = runInThread(in);
            runOut(out);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(inputThread != null) inputThread.interrupt();
            if (clientSocket != null) clientSocket.close();
            if (socket != null) socket.close();
        }
    }

    private void runOut(DataOutputStream out) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String message = scanner.next();
            out.writeUTF(message);
            if (message.equals("/end")){
                break;
            }
        }
    }

    private Thread runInThread(DataInputStream in) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String message = in.readUTF();
                    System.out.println("С клиента: " + message);
                    if (message.equals("/end")){
                        System.exit(0);
                    }
                } catch (IOException e) {
                    System.out.println("Соединение было закрыто");
                    break;
                }
            }
        });
        thread.start();
        return thread;
    }
}
