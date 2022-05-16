package com.uj.it28x87.honours.d04.configuration.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HonoursEmsConfigurationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HonoursEmsConfigurationServerApplication.class, args);
    }

}
