package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@SuppressWarnings("checkstyle:hideutilityclassconstructor")
@ComponentScan(basePackages = { "com.example.service", "com.example.controller" })

public class MainService extends SpringBootServletInitializer {

    public static final void main(final String[] args) {
        SpringApplication.run(MainService.class, args);
    }

    @Override
    protected final SpringApplicationBuilder configure(final SpringApplicationBuilder builder) {
        return builder.sources(MainService.class);
    }

}
