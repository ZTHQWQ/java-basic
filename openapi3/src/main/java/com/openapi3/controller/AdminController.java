package com.openapi3.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "管理员接口", description = "管理员相关操作")
@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/info")
    public String adminInfo() {
        return "这是管理员接口";
    }
}