package com.openapi3;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Openapi3Application {

    public static void main(String[] args) {
        SpringApplication.run(Openapi3Application.class, args);
    }

    @Bean
    public OpenAPI myOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("社区交互系统 API 文档")
                        .version("1.0.0")
                        .description("基于 Spring Boot 的后端接口文档")
                        .contact(new Contact()
                                .name("张三")
                                .email("zhangsan@example.com")
                                .url("https://yourdomain.com")));
    }


}
