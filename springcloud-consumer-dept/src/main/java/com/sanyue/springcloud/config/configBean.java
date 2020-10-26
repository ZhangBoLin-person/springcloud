package com.sanyue.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author BoLin
 * @create 2020-10-26 14:10
 */
@Configuration
public class configBean {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
