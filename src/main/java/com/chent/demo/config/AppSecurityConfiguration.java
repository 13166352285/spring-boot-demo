//package com.chent.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
///**
// * Security场景的自动配置类：
// * SecurityAutoConfiguration、SpringBootWebSecurityConfiguration、SecurityFilterAutoConfiguration、
// * 1、security的所有配置在 SecurityProperties： 以spring.security开头
// * 2、默认SecurityFilterChain组件：
// * - 所有请求都需要认证（登录）
// * - 开启表单登录: spring security提供一个默认登录页，未经登录的所有请求都需要登录
// * - httpBasic方式登录
// * 3、@EnableWebSecurity 生效
// * - WebSecurityConfiguration生效：web安全配置
// * - HttpSecurityConfiguration生效：http安全规则
// * - @EnableGlobalAuthentication生效：全局认证生效
// * - AuthenticationConfiguration：认证配置
// * <p>
// * 1. 自定义授权规则httpSecurity.authorizeHttpRequests
// * 2. 自定义登录规则 httpSecurity.formLogin
// * 3.自定义用户信息查询规则
// * 4. 开启方法级别的精确权限控制@EnableMethodSecurity + @PreAuthorize("hasAuthority('world_exec')")
// */
//@EnableMethodSecurity
//@Configuration
//public class AppSecurityConfiguration {
//
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        // 请求授权
//        httpSecurity.authorizeHttpRequests(registry -> {
//            registry.requestMatchers("/").permitAll() // 首页所有人都允许
//                    .anyRequest().authenticated(); // 剩下的任意请求都需要认证（登录）
//        });
//        // 表单登录
//        // 表单登录功能：开启默认表单登录功能；Spring Security提供默认登录页
//        httpSecurity.formLogin(formLogin -> {
//            formLogin.loginPage("/login").permitAll(); // 自定义登录页位置，并且所有人都能访问
//        });
//        return httpSecurity.build();
//    }
//
//    @Bean
//        // 查询用户信息
//    UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//        UserDetails zhangsan = User.withUsername("zhangsan").password(passwordEncoder.encode("123456")).roles("admin", "hr").authorities("file_read", "file_write").build();
//
//        UserDetails lisi = User.withUsername("lisi").password(passwordEncoder.encode("123456")).roles("hr").authorities("file_read").build();
//
//        UserDetails wangwu = User.withUsername("wangwu").password(passwordEncoder.encode("123456")).roles("admin").authorities("file_write", "world_exec").build();
//        // 默认内存中保存用户信息
//        return new InMemoryUserDetailsManager(zhangsan, lisi, wangwu);
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
