package com.chent.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@ConfigurationProperties(prefix = "com.chent")
public class DemoProperties {

    private String version;
    private String name;
}
