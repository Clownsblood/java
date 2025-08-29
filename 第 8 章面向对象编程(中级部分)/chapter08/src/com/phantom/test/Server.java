package com.phantom.test;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        // 1. 创建服务器Socket，监听8888端口
        ServerSocket server = new ServerSocket(8888);
        System.out.println("服务器已启动，等待连接...");

        // 2. 等待客户端连接（阻塞，直到有客户端来连）
        Socket socket = server.accept();
        System.out.println("客户端已连接！");

        // 3. 通过输入流接收数据
        InputStream in = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String msg = br.readLine(); // 读取客户端发送的消息
        System.out.println("收到客户端消息：" + msg);

        // 4. 关闭资源
        br.close();
        socket.close();
        server.close();
    }
}