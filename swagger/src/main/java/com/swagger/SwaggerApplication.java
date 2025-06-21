package com.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
@EnableOpenApi
public class SwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerApplication.class, args);
    }

    /*
     *   application中还配置了mvc，因为springboot2.6.1与swagger3不兼容
     */

    @Value("${swagger.enabled}")
    private boolean swaggerEnable;


    @Bean
    public Docket createRetApi(){
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .groupName("测试")
                // ture 启用Swagger3.0， false 禁用（生产环境要禁用）
                .enable(swaggerEnable)
                .select()
                // 扫描的路径使用@Api的controller
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any())
                .build();

    }


    /**
     * Swagger 页面显示的 API 信息
     * @return ApiInfo
     */
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Swagger3 接口文档")
                .description("swagger3 测试文档")
                .contact(new Contact("张天浩",  // 联系人
                        "https://blog.csdn.net/qq_51511388?type=blog",
                        "937232898@qq.com"))
                .license("Apache 2.0 开源许可")   // 许可证名称
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0") // 许可证链接
                .version("1.0.0")    // 文档版本
                .build();
    }


}
