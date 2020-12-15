package com.oltraining.oltraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories({
        "com.oltraining.oltraining.repository"
})
@EntityScan({
        "com.oltraining.oltraining.model"
})
@ComponentScan(basePackages = {
        "com.oltraining.oltraining.mapper",
        "com.oltraining.oltraining.dto",
        "com.oltraining.oltraining.service",
        "com.oltraining.oltraining.security",
        "com.oltraining.oltraining.config",
        "com.oltraining.oltraining.controller"
})
public class OlTrainingApplication {
    public static void main(String[] args) {
        SpringApplication.run(OlTrainingApplication.class, args);
    }
}
