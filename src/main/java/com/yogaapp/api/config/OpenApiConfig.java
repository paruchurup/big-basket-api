package com.yogaapp.api.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
	
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Yoga App REST API")
                        .description("Yoga App (`rest-service`) is used by the HTML version of Yoga App for RESTful API processing.")
                        .version("1.0"));
    }
	
}
