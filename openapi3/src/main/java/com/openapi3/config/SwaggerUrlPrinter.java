package com.openapi3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SwaggerUrlPrinter implements CommandLineRunner {

    // 从application.yml中获取端口和Swagger路径
    @Value("${server.port:/}")
    private String port;
    
    // 适配Springfox/SpringDoc的不同路径
    @Value("${server.servlet.context-path:/}")
    private String contextPath;

    private final String swaggerPath = "/swagger-ui/index.html?"; // Springfox默认路径
    
    @Override
    public void run(String... args) {
        // 拼接完整可点击链接
        String fullUrl = String.format(
            "http://localhost:%s%s%s", 
            port, 
            contextPath.endsWith("/") ? "" : contextPath,
            swaggerPath
        );
        
        // 打印带格式的链接（IDEA自动识别）
        System.out.println("\n=========================================");
        System.out.print("✅ Swagger UI 已启动，点击访问：");
        System.out.println(fullUrl);
        System.out.println("=========================================\n");
    }
}