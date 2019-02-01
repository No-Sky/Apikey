package com.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @description:
 * @author: XFW
 * @version:
 * @create: 2019-02-01 18:48
 **/
@Configuration
@EnableSwagger2
@EnableWebMvc
@ComponentScan(basePackages = {"com.api.controller"})
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API 接口文档")
                .description("本页面由最新代码生成，所有接口都为最新版")
                .termsOfServiceUrl("api.fuckby.me")
                .license("")
                .licenseUrl("")
                .version("1.0.0")
                .build();
    }
}
