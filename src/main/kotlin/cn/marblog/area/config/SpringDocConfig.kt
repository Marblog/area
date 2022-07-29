package com.cnooc.epidemic.config

import io.swagger.v3.oas.models.ExternalDocumentation
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.License
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author 18721
 */
@Configuration
open class SpringDocConfig {
    @Bean
    open fun springShopOpenApi(): OpenAPI {
        return OpenAPI()
            .info(
                Info().title("SpringShop API")
                    .description("Spring shop sample application")
                    .version("v1.0")
                    .license(License().name("Apache 2.0").url("https://springdoc.org"))
            )
            .externalDocs(
                ExternalDocumentation()
                    .description("SpringShop Wiki Documentation")
                    .url("https://springshop.wiki.github.org/docs")
            )
    }
}