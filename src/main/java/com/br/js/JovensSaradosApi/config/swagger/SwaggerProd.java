package com.br.js.JovensSaradosApi.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerProd {

	@Bean
	public Docket jovensSaradosApiSwagger() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.ant("/**")).build().apiInfo(new ApiInfoBuilder().title("Api Jovens Sarados")
						.version(getClass().getPackage().getImplementationVersion()).build());
	}
}
