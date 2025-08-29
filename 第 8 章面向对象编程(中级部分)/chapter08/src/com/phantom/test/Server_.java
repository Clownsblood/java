package com.phantom.test;

import java.io.IOException;
import java.net.ServerSocket;

public class Server_ {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务器已开启，等待用户连接...");
        serverSocket.accept();
        System.out.println("客户端已连接");
    }
}
