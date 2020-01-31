package com.example.net_clien;

import com.example.net_clien.socket.SocketClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootNetClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootNetClientApplication.class, args);

        SocketClient.start();
    }

}
