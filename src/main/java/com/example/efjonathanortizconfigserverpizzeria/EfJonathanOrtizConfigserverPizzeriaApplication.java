package com.example.efjonathanortizconfigserverpizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class EfJonathanOrtizConfigserverPizzeriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EfJonathanOrtizConfigserverPizzeriaApplication.class, args);
    }

}
