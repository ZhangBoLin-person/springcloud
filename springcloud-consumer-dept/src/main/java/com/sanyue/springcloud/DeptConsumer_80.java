package com.sanyue.springcloud;

import com.sanyue.myrule.TRule;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author BoLin
 * @create 2020-10-26 16:56
 */
@EnableEurekaClient
@SpringBootApplication
//在微服务启动的时候我们能去自定义自己的ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = TRule.class)
public class DeptConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
