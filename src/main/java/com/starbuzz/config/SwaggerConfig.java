package com.starbuzz.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI coffeeOrderOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Coffee Order API")
                        .description("API para gerenciar pedidos de café")
                        .version("v1.0"));
    }
}
