package com.mr.mall_servlce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MallServlceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallServlceApplication.class, args);
    }

}
