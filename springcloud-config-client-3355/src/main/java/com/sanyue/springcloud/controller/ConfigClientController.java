package com.sanyue.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BoLin
 * @create 2020-11-11 14:05
 */
@RestController
public class ConfigClientController {
    //value里面的值  为远程Git配置文件中的值
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        return
                "applicationName"+applicationName+
         "eurekaServer"+eurekaServer+
         "port"+port;
    }
}
