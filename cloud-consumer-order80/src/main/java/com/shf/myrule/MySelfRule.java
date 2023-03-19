package com.shf.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Su HangFei
 * @Date:2023-03-13 20 52
 * @Project:Cloud
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}
