package com.sanyue.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author BoLin
 * @create 2020-10-26 16:56
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.sanyue.springcloud"})
@ComponentScan("com.sanyue.springcloud")
public class FeignDeptConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class,args);
    }
}
