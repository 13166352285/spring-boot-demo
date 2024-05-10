package com.chent.demo.controller;

import com.chent.demo.entity.EmpInfo;
import com.chent.demo.service.EmpInfoService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class EmpInfoController {

//    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    EmpInfoService empInfoService;

    @PostMapping(value = "api/queryEmpInfoList")
    public List<EmpInfo> queryEmpInfoList() {

//        logger.info("hhah,方法进来了");
//        log.info("hhah,方法进来了");
        log.trace("trace 日志...");
        log.debug("debug 日志。。。");
        // spring boot 默认日志级别是info
        log.info("info 日志。。。");
        log.warn("warn 日志。。。");
        log.error("error 日志。。。");
        return empInfoService.getEmpInfoList();
    }

}
