package com.mr.mall.mall_promotion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
public class MallPromotionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallPromotionApplication.class, args);
    }

}
