package com.emmutua.elearningplatform.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.HttpRequestHandlerServlet;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
private ApiInfo apiInfo(){
    Contact contact = new Contact(
            "Emmanuel Mulwa",
            "https://github.com/emmanuel-mutua/",
            "emmamulwa2020@gmail.com"
    );
    return new ApiInfo(
            "Elearning Api's",
            "The Apis development are inspired by desire to build complete Backend for Elearning platform",
            "version 1.0",
            "",
            contact,
            "All rights reserved for the developer",
            "",
            Collections.emptyList()
    );
    }

}
