package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties

public class Application {

        public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

    }

}
