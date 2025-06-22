package com.openapi3.config;


import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerGroupConfig {

    /**
     * 用户模块接口分组
     * 只扫描 /user/** 路径下的接口
     */
    @Bean
    public GroupedOpenApi userGroup() {
        return GroupedOpenApi.builder()
                .group("用户模块")  // 分组名称
                .pathsToMatch("/user/**")  // 指定路径规则
                .build();
    }

    /**
     * 管理员模块接口分组
     * 只扫描 /admin/** 路径下的接口
     */
    @Bean
    public GroupedOpenApi adminGroup() {
        return GroupedOpenApi.builder()
                .group("管理员模块")
                .pathsToMatch("/admin/**")
                .build();
    }
}
