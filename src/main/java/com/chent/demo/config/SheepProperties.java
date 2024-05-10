package com.chent.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "sheep")
public class SheepProperties {

    private Long id;
    private String name;
    private Integer age;
}
