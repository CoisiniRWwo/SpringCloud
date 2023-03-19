package com.shf.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:Su HangFei
 * @Date:2023-03-15 20 35
 * @Project:Cloud
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
