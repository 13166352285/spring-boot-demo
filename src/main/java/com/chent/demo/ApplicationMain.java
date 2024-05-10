package com.chent.demo;

import com.chent.demo.config.DemoProperties;
import com.chent.demo.config.SheepProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.chent.demo.Mapper")
public class ApplicationMain {

    public static void main(String[] args) {

        SpringApplication.run(ApplicationMain.class, args);
//        ConfigurableApplicationContext run = SpringApplication.run(ApplicationMain.class, args);
//        DemoProperties demoProperties = run.getBean(DemoProperties.class);
//        System.out.println("demoProperties: " + demoProperties);
//
//        SheepProperties sheep = run.getBean(SheepProperties.class);
//        System.out.println("sheep: " + sheep);


    }
}
