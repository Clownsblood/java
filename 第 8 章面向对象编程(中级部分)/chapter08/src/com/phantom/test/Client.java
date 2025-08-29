package com.phantom.test;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {
        // 1. 连接服务器（IP是127.0.0.1，端口8888）
        Socket socket = new Socket("127.0.0.1", 8888);

        // 2. 通过输出流发送数据
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(out);
        pw.println("你好，服务器！"); // 发送消息
        pw.flush(); // 刷新缓冲区，确保数据发出
        System.out.println("请输入要发送的消息");
        // 3. 关闭资源
        pw.close();
        socket.close();
    }
}