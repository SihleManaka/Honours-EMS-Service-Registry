package com.uj.it28x87.honours.do4.discovery.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //to enable eureka server
public class HonoursEmsDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HonoursEmsDiscoveryServerApplication.class, args);
    }

}
