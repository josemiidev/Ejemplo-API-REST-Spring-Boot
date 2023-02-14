package dev.josemii.api_rest_ejemplo;

import dev.josemii.api_rest_ejemplo.Modelo.EmpleadosClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackageClasses=EmpleadosClass.class)
public class ApiRestEjemploApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiRestEjemploApplication.class, args);
    }

}
