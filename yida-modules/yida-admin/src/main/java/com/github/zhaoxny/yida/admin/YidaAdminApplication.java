package com.github.zhaoxny.yida.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YidaAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaAdminApplication.class, args);
    }

}
