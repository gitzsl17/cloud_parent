package com.mn.cloud_common.es.config;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Description swagger配置文件
 * @Autor Administrator
 * @Date 2019-5-16 15:02
 * @Version 1.0
 **/

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))   // 使用此处两个注解表示只要class上方含有@Api,method上含有@ApiOperation注解的均可以展示
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //.apis(RequestHandlerSelectors.basePackage("com.mn.cloud_common"))    // 使用该扫描方式:采用指定扫描的包路径来定义，Swagger会扫描该包下所有com.mn.cloud_common定义的API，并产生文档内容（除了被@ApiIgnore指定的请求）
                .paths(PathSelectors.any())
                .build();
    }

    /**
     *  ApiInfo
     * @return ApiInfo
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springCloud 中使用Swagger2构建restful APIs")
                .description("Interface API")
                //.termsOfServiceUrl("")
                .contact(new Contact("author", "", "victor.com"))
                .version("1.0")
                .build();
    }

    /**
     * uiConfig
     * @return UiConfiguration
     */
    @Bean
    UiConfiguration uiConfig() {
        return new UiConfiguration(null, "list", "alpha", "schema",
                UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS, false, true, 60000L);
    }
}
