package com.chent.demo.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
/**
 * 1.开启sheep组件的属性绑定
 * 2.默认把组件放入容器中
 * */
@EnableConfigurationProperties(SheepProperties.class) // 一般用于导入第三方写好的组件进行属性绑定
@SpringBootConfiguration
public class SheepConfiguration {

}
