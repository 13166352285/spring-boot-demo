package com.chent.demo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoAutoConfiguration {

    @Bean
    public DemoProperties demoModule(){
        return new DemoProperties();
    }
}
