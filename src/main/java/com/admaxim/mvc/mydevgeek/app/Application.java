package com.admaxim.mvc.mydevgeek.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.admaxim.mvc.mydevgeek.app")
@EnableJpaRepositories(basePackages = "com.admaxim.mvc.mydevgeek.app.repo")
@EntityScan(basePackages = "com.admaxim.mvc.mydevgeek.app.mydevgeek.domain")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
