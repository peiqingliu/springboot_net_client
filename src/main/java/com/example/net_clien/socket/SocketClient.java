package com.example.net_clien.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.Socket;

@Slf4j
public class SocketClient {

    public static void start(){
        int port = 7000;
        String host = "localhost";
        try {
            // 创建一个套接字并将其连接到指定端口号
            Socket socket = new Socket(host,port);

            //输入流
            DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            //输出流
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));

            double length = 2.0;
            dos.writeDouble(length);
            dos.flush();

            double area = dis.readDouble();
            log.info("服务端算出的面积为=" + area);

            //关闭流
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
