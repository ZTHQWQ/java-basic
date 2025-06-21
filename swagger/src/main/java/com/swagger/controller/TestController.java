package com.swagger.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试用例")
@RestController
public class TestController {

    @ApiOperation(value = "测试方法")
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
