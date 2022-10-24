package com.esprit.examen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SpringFoxSwaggerConfig {

	public static final String AUTHORIZATION_HEADER = "Authorization";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiEndPointsInfo())
				.securityContexts(Collections.singletonList(securityContext()))
				.securitySchemes(Arrays.asList(apiKey()))
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.esprit.examen.controller"))
				.paths(PathSelectors.any())
				.build();
	}
	
    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder()
                .title("My STOCK PROJECT")
                .description("Micro-Service Documentation")
                .version("1.0.0")
                .build();
    }

	private ApiKey apiKey() {
		return new ApiKey("Bearer", AUTHORIZATION_HEADER, "header");
	}
	
	
	private SecurityContext securityContext() {
		return SecurityContext.builder()
				.securityReferences(defaultAuth())
				.build();
	}

	private List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return Arrays.asList(new SecurityReference("Bearer", authorizationScopes)); 

	}
}