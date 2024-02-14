package com.example.vursachbacklogin;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
        info = @Info(
                title = "API Авторизации",
                version = "1.0",
                description = "API для авторизации в сервисах учета мед оборудования")
)
@SpringBootApplication
public class VursachbackloginApplication {

    public static void main(String[] args) {
        SpringApplication.run(VursachbackloginApplication.class, args);
    }

}
