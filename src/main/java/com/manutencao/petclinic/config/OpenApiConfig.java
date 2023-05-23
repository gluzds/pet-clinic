package com.manutencao.petclinic.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Pet Clinic", version = "v1"), externalDocs = @ExternalDocumentation(url = "https://github.com/"))
public class OpenApiConfig {

}
