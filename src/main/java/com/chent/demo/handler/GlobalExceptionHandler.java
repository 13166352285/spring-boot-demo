package com.chent.demo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice // 这个类是集中处理所有@Controller发生的错误
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public String handlerException(Exception e){
        return "Ohho~~统一处理，原因： " + e.getMessage();
    }
}
