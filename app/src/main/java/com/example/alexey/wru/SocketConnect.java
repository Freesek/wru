package com.example.alexey.wru;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by alexey on 06.12.16.
 */

public class SocketConnect extends AsyncTask<String, Void, String>{
    final private String toServerMessage;
    final private int port;
    private String serverMessage;
    private boolean messageIsCatch = false;

    public boolean isMessageIsCatch() {
        return messageIsCatch;
    }

    public SocketConnect(String message, int port) {
        this.toServerMessage = message;
        this.port = port;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    @Override
    protected String doInBackground(String... params) {
        String result = null;
        Socket serverSocket = new Socket();
        try {
            serverSocket.connect(new InetSocketAddress(params[0], port));
            messageToServer(serverSocket);
            result = readMessageFromServer(serverSocket);
            serverMessage = result;
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {}
        return result;
    }

    private boolean messageToServer(Socket socket) throws IOException {
        if(socket.isClosed()) {
            return false;
        }
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        pw.write("1234567890gmd?\n");
        pw.flush();
        return true;
    }
    private String readMessageFromServer(Socket socket) throws IOException, InterruptedException {
        String message = "";
        int cnt = 0;
        if(socket.isClosed()) {
            throw new IOException("Socket is closed(my err)");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        message = reader.readLine();
        reader.close();
        messageIsCatch = true;
        return message;
    }
}
