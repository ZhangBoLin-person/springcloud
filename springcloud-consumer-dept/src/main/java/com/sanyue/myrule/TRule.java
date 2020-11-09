package com.sanyue.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author BoLin
 * @create 2020-11-09 10:27
 */
@Configuration
public class TRule {


    @Bean
    public IRule myRule(){
        return new TRandomRule();//默认是轮训，现在我们使用自定义
    }

}
