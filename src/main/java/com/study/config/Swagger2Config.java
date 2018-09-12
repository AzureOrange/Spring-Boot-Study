package com.study.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger配置
 *
 * @author orange
 */

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Value("${swagger.enabled}")
    private boolean openSwaggerStatus;

    @Bean
    public Docket createRestApi() {
        if (openSwaggerStatus) {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfoValid())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.study.http"))
                    .paths(PathSelectors.any())
                    .build();
        } else {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfoValid())
                    .select()
                    // 添加路径过滤，设置为全部都不符合
                    .paths(PathSelectors.none())
                    .build();
        }
    }

    private ApiInfo apiInfoValid() {
        return new ApiInfoBuilder()
                .title("VPN")
                .description("测试接口")
                .contact("orange")
                .version("1.0")
                .build();
    }

}
