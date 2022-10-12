package com.manager.ecole.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api() {
    String groupName = "manager";
    return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage(("com.manager.ecole.controller")))
            .paths(PathSelectors.any())
            .build()
            .groupName(groupName)
            .apiInfo(metadataAbb());
  }

  private ApiInfo metadataAbb() {
    return new ApiInfoBuilder()
            .title("Manager_Ecole")
            .description("Swagger for Manager_Ecole")
            .version("1.0")
            .build();
  }

}
