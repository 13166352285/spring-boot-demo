package com.chent.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello,Spring Security!";
    }

//    @PreAuthorize("hasAuthority('world_exec')")
    @GetMapping("/world")
    public String word() {
        return "hello World!";
    }
}
